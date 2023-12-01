package com.dbapi.service;

import com.dbapi.exception.NotFoundException;
import com.dbapi.model.dao.FilmDao;
import com.dbapi.model.entity.Film;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IFilmService{

    private final FilmDao filmDao;

    public ServiceImpl(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @Override
    public Film update(Film film) throws NotFoundException {
        Film filmReturn = filmDao.save(film);
        if(filmReturn == null){
            throw new NotFoundException("User is not available");
        }
        return filmReturn;
    }

    @Override
    public Boolean delete(Integer filmId){
        Film film = filmDao.findById(filmId).orElse(null);
        if(film == null){
            return false;
        }else{
            filmDao.delete(film);
            return true;
        }

    }
}
