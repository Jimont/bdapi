package com.dbapi.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "films")
public class Film {
    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer filmId;
    @Column(name="episode_id")
    private Integer episodeId;
    private String title;
    @Column(name="release_date")
    private Date releaseDate ;
}
