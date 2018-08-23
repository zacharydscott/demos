import { Request, Response } from 'express';
import express from 'express';
import * as movieDao from '../dao/movie-dao';

// all routes defiend with this object will imply /movies
export const movieRouter = express.Router(); // routers represent a subset of routes for the express application

let movies = [
  {
    id: 1,
    title: 'The Notebook',
    numBlades: 16
  },
  {
    id: 2,
    title: 'Saw',
    numBlades: 0
  },
  {
    id: 3,
    title: 'Edward Scissor Hands',
    numBlades: 3
  }
]

/**
 * Find all movies
 */
movieRouter.get('', async (req: Request, resp: Response) => {
  try {
    console.log('retrieving all movies');
    let movies = await movieDao.findAll();
    resp.json(movies);
  } catch (err) {
    resp.sendStatus(500);
  }
});

/**
 * Find movie by id
 */
movieRouter.get('/:id', async (req, resp) => {
  const id = +req.params.id; // convert the id to a number
  console.log(`retreiving movie with id  ${id}`)
  try {
    let movie = await movieDao.findById(id);
    if (movie[0] !== undefined) {
      resp.json(movie[0]);
    } else {
      resp.sendStatus(400);
    }
  } catch (err) {
    resp.sendStatus(500);
  }
});

movieRouter.post('', async (req, resp) => {
  try {
    const id = await movieDao.createMovie(req.body);
    resp.status(201);
    resp.json(id);
  } catch {
    resp.sendStatus(500);
  }
})

/**
 * Update movie
 */
movieRouter.put('', (req, resp) => {
  const updatedMovie = req.body;
  console.log(`attempting to update movie with id ${updatedMovie.id}`);
  const exists = movies.some((movie, index) => {
    if (movie.id === updatedMovie.id) {
      movies[index] = updatedMovie;
      resp.end();
      return true;
    }
    else {
      return false;
    }
  });
  if (!exists) {
    resp.sendStatus(400);
  }
})