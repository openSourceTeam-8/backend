package com.example.opensource_server.review.service;

import com.example.opensource_server.review.dto.response.MovieReviewPageDto;

public interface ReviewService {
    MovieReviewPageDto findMovieReviews(Long movieId);
}
