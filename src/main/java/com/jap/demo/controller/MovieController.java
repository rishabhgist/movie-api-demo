package com.jap.demo.controller;
import com.jap.demo.domain.Movie;
import com.jap.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.save(movie), HttpStatus.CREATED);
    }
    @GetMapping("/getAll")
    public ResponseEntity<?> getMovie(){
        return new ResponseEntity<>(movieService.getAll(), HttpStatus.OK);
    }
}
