package dev.luispardo.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.luispardo.apimovies.models.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
  
}
