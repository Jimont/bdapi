package com.dbapi.service;

import com.dbapi.exception.NotFoundException;
import com.dbapi.model.entity.Film;

public interface IFilmService {
    Film update(Film film) throws NotFoundException;
    Boolean delete(Integer filmId);
}
