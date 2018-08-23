import { connectionPool } from "../util/connection-util";


export async function findAll() {
  const client = await connectionPool.connect();
  try {
    const client = await connectionPool.connect();
    const resp = await client.query('SELECT * FROM movies.movies');
    return resp.rows;
  } finally {
    client.release();
  }
}

export async function findById(id: number) {
  const client = await connectionPool.connect();
  try {
    const resp = await client.query('SELECT * FROM movies.movies WHERE id = $1', [id]);
    return resp.rows;
  } finally {
    client.release();
  }
}