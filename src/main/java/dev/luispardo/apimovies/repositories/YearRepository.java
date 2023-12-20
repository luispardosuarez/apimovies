package dev.luispardo.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.luispardo.apimovies.models.Year;

public interface YearRepository extends JpaRepository <Year,Long> {

}
