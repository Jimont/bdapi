package com.dbapi.controller;

import com.dbapi.exception.NotFoundException;
import com.dbapi.model.entity.Film;
import com.dbapi.service.IFilmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class FilmController {
    private final IFilmService filmService;

    public FilmController(IFilmService filmService) {
        this.filmService = filmService;
    }

    @PutMapping("/film")
    public ResponseEntity<Film> updateFilm(@RequestBody Film film) throws NotFoundException {
        return new ResponseEntity<>(filmService.update(film), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/film/{id}")
    public ResponseEntity<Boolean> deleteFilm(@PathVariable Integer id) throws NotFoundException {
        return new ResponseEntity<>(filmService.delete(id), HttpStatus.ACCEPTED);
    }
}
