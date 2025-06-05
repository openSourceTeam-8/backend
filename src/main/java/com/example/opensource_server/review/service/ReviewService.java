package com.example.opensource_server.review.service;

import com.example.opensource_server.review.dto.request.ReviewCreateRequestDto;
import com.example.opensource_server.review.dto.response.ReviewCreateResponseDto;

public interface ReviewService {
    ReviewCreateResponseDto createReview(Long movieId, ReviewCreateRequestDto reviewCreateRequestDto);
}
