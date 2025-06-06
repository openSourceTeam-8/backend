package com.example.opensource_server.movie.service;

import com.example.opensource_server.movie.dto.request.MovieByGenreRequestDTO;
import org.springframework.http.ResponseEntity;

public interface MovieService {

    ResponseEntity provideMoviesByGenre(MovieByGenreRequestDTO movieByGenreRequestDto);

}
