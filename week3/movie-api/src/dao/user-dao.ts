import { connectionPool } from "../util/connection-util";
import { Movie } from "../model/movie";
import { User } from "../model/user";
import { movieConverter } from "../util/movie-converter";
import { userConverter } from "../util/user-converter";


export async function findAll(): Promise<User[]> {
  const client = await connectionPool.connect();
  try {
    const resp = await client.query(
      `SELECT * FROM movies.app_users u
        LEFT JOIN movies.users_movies
        USING (user_id)
        LEFT JOIN movies.movies m
        USING(movie_id)`);

    // extract the users and their movies from the result set
    const users = [];
    resp.rows.forEach((user: any) => {
      const movie = movieConverter(user);
      const exists = users.some( existingUser => {
        if(user.user_id === existingUser.id) {
          movie.id && existingUser.movies.push(movie);
          return true;
        }
      })
      if (!exists) {
        const newUser = userConverter(user);
        movie.id && newUser.movies.push(movie);
        users.push(newUser);
      }
    })


    return users;
  } finally {
    client.release();
  }
}

export async function findById(id: number): Promise<User> {
  const client = await connectionPool.connect();
  try {
    const resp = await client.query(
      `SELECT * FROM movies.app_users u
        LEFT JOIN movies.users_movies
        USING (user_id)
        LEFT JOIN movies.movies m
        USING(movie_id)
        WHERE u.user_id = $1`, [id]);
        const user = userConverter(resp.rows[0]); // get the user data from first row

        // get the movies from all the rows
        resp.rows.forEach((movie) => {
          movie.movie_id && user.movies.push(movieConverter(movie));
        })
        return user;
  } finally {
    client.release();
  }
}

export async function create(user: User): Promise<number> {
  const client = await connectionPool.connect();
  try {
    const resp = await client.query(
      `INSERT INTO movies.app_users 
        (username, password, role)
        VALUES ($1, $2, 'customer') 
        RETURNING id`, [user.username, user.password]);
    return resp.rows[0].id;
  } finally {
    client.release();
  }
}