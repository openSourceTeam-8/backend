package com.example.opensource_server.movie.service;

import com.example.opensource_server.common.dto.ResponseForm;
import com.example.opensource_server.common.handler.ResponseHandler;
import com.example.opensource_server.movie.dao.MovieRepository;
import com.example.opensource_server.movie.domain.Movie;
import com.example.opensource_server.movie.dto.request.MovieByGenreRequestDTO;
import com.example.opensource_server.movie.dto.response.FilteredMoviesResponseDTO;
import com.example.opensource_server.review.domain.Review;
import com.example.opensource_server.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository;
    private final ReviewRepository reviewRepository;

    @Override
    public ResponseEntity provideMoviesByGenre(MovieByGenreRequestDTO movieByGenreRequestDto) {
        try {
            List<Movie> movies = movieRepository.findByGenre(movieByGenreRequestDto.genre());
            List<FilteredMoviesResponseDTO> response = filterAndConvert(movies);
            return ResponseHandler.create200Response(new ResponseForm(), response);
        } catch (RuntimeException e) {
            return ResponseHandler.create404Error(new ResponseForm(), e);
        } catch (Exception e) {
            return ResponseHandler.create500Error(new ResponseForm(), e);
        }
    }

    private List<FilteredMoviesResponseDTO> filterAndConvert(List<Movie> movies) {
        return movies.stream()
                .map(movie -> {
                    Review latestReview = reviewRepository.findFirstByMovieOrderByCreatedAtDesc(movie)
                            .orElse(null);

                    com.example.opensource.review.dto.response.SummaryReviewResponseDTO summaryReview = latestReview != null
                            ? com.example.opensource.review.dto.response.SummaryReviewResponseDTO.builder()
                            .score(latestReview.getScore())
                            .comment(latestReview.getReviewContents())
                            .build()
                            : null;

                    return FilteredMoviesResponseDTO.from(movie, summaryReview);
                })
                .toList();
    }
}
