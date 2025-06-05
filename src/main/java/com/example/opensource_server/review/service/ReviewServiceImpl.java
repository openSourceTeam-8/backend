package com.example.opensource_server.review.service;

import com.example.opensource_server.movie.dao.MovieRepository;
import com.example.opensource_server.movie.domain.Movie;
import com.example.opensource_server.review.dto.response.MovieReviewPageDto;
import com.example.opensource_server.review.dto.response.ReviewDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService{
    private final MovieRepository movieRepository;
    public ReviewServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    @Override
    public MovieReviewPageDto findMovieReviews(Long movieId) {
        Movie movie = movieRepository.findById(movieId)
                .orElseThrow(() -> new IllegalArgumentException("영화를 찾을 수 없습니다."));

        List<ReviewDto> reviewDtos = movie.getReviews().stream()
                .map(ReviewDto::fromEntity)
                .toList();

        return MovieReviewPageDto.fromEntity(movie, reviewDtos);
    }
}