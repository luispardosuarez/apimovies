package dev.luispardo.apimovies.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.luispardo.apimovies.exceptions.MovieNotFoundException;
import dev.luispardo.apimovies.models.Movie;
import dev.luispardo.apimovies.repositories.MovieRepository;

@Service

public class MovieService {
  MovieRepository repository;

  public MovieService(MovieRepository repository) {
    this.repository = repository;
  }

  public List<Movie> getAll() {
    List<Movie> movies = repository.findAll();
    return movies;
  }

  public Movie getById(Long id) throws Exception {
    Movie movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

    return movie;
  }

  public Movie save(Movie movie) {

    Movie newMovie = repository.save(movie);
    return newMovie;
  }

  public Movie update(Long id, Movie movie) throws Exception {

    Movie updatingMovie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

    updatingMovie.setTitle(movie.getTitle());
    updatingMovie.setDescription(movie.getDescription());
    updatingMovie.setRunning_time(movie.getRunning_time());
    updatingMovie.setCreation_year(movie.getCreation_year());

    Movie updatedMovie = repository.save(updatingMovie);

    return updatedMovie;

  }

  public String delete(Long id) throws Exception {

    Movie movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

    repository.delete(movie);

    String message = "The movie is deleted";

    return message;
  }

}