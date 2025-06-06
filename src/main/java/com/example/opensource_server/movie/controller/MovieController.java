package com.example.opensource_server.movie.controller;

import com.example.opensource_server.movie.dto.request.MovieByCountryRequestDTO;
import com.example.opensource_server.movie.dto.request.MovieByGenreRequestDTO;
import com.example.opensource_server.movie.service.MovieService;
import com.example.opensource_server.review.dto.response.MovieReviewPageDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
@Tag(name = "Movie API", description = "영화 관련 API")
public class MovieController {

    private final MovieService movieService;

    @Operation(summary = "장르별 영화 조회")
    @PostMapping("/by-genre")
    public ResponseEntity lookupMoviesByGenre(@RequestBody MovieByGenreRequestDTO movieByGenreRequestDto) {
        return movieService.provideMoviesByGenre(movieByGenreRequestDto);
    }

    @Operation(summary = "국가별 영화 조회")
    @PostMapping("/by-country")
    public ResponseEntity lookuoMovieByCountry(@RequestBody MovieByCountryRequestDTO movieByCountryRequestDTO) {
        return movieService.provideMoviesByCountry(movieByCountryRequestDTO);
    }
    @Operation(summary = "관람평 TOP 10 영화 조회")
    @GetMapping("/top10-movies")
    public ResponseEntity<List<MovieReviewPageDto>> getTop10ReviewedMovies() {
        return ResponseEntity.ok(movieService.getTop10ReviewedMovies());
    }
    @Operation(summary = "최신 개봉한 영화순으로 정렬하여 조회")
    @GetMapping("/latest")
    public ResponseEntity<List<MovieReviewPageDto>> getLatestReleasedMovies() {
        return ResponseEntity.ok(movieService.getLatestReleasedMovies());
    }



}
