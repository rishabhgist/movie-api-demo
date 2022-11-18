package com.jap.demo.service;

import com.jap.demo.domain.Movie;

import java.util.List;

public interface IMoiveService {
    Movie save(Movie movie);

    List<Movie> getAll();
}
