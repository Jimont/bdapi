package com.dbapi.model.dao;

import com.dbapi.model.entity.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmDao extends CrudRepository<Film, Integer> {
}
