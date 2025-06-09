package com.example.opensource_server.movie.service;

import com.example.opensource_server.movie.dto.request.MovieByCountryRequestDTO;
import com.example.opensource_server.movie.dto.request.MovieByGenreRequestDTO;
import com.example.opensource_server.review.dto.response.MovieReviewPageDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieService {

    ResponseEntity provideMoviesByGenre(MovieByGenreRequestDTO movieByGenreRequestDto);

    ResponseEntity provideMoviesByCountry(MovieByCountryRequestDTO movieByCountryRequestDTO);
    List<MovieReviewPageDto> getTop10ReviewedMovies();
    List<MovieReviewPageDto> getLatestReleasedMovies();

}
