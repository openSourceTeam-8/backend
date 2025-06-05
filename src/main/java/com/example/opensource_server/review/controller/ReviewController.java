package com.example.opensource_server.review.controller;

import com.example.opensource_server.review.dto.request.ReviewCreateRequestDto;
import com.example.opensource_server.review.dto.response.ReviewCreateResponseDto;
import com.example.opensource_server.review.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{movieId}/review")// 리뷰 달고 싶은 특정 영화(리뷰)페이지에 접속한 후
public class ReviewController {
    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    //리뷰 달기
    @PostMapping("/create")
    public ResponseEntity<ReviewCreateResponseDto> createReview(@PathVariable("movieId") Long movieId,
                                                                @RequestBody ReviewCreateRequestDto reviewCreateRequestDto) {
        ReviewCreateResponseDto reviewCreateResponseDto = reviewService.createReview(movieId, reviewCreateRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewCreateResponseDto);
    }
}
