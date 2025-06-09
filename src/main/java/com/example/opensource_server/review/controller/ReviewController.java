package com.example.opensource_server.review.controller;


import com.example.opensource_server.review.dto.request.ReviewCreateRequestDto;
import com.example.opensource_server.review.dto.response.ReviewCreateResponseDto;
import com.example.opensource_server.review.service.ReviewService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.opensource_server.review.dto.response.MovieReviewPageDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("{movieId}/review")// 리뷰 달고 싶은 특정 영화(리뷰)페이지에 접속한 후
@Tag(name = "Movie Review Page API", description = "선택한 영화 리뷰 페이지 관련 API")
public class ReviewController {
    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @Operation(summary = "선택한 영화에 리뷰 작성")
    @PostMapping("/create")
    public ResponseEntity<ReviewCreateResponseDto> createReview(@PathVariable("movieId") Long movieId,
                                                                @RequestBody ReviewCreateRequestDto reviewCreateRequestDto) {
        ReviewCreateResponseDto reviewCreateResponseDto = reviewService.createReview(movieId, reviewCreateRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewCreateResponseDto);
    }
    // 리뷰 달고 싶은 영화 리뷰 페이지 접속하면 보이는 기본 화면
    // 하나의 특정 영화에 달린 리뷰 확인하는 페이지
    @Operation(summary = "선택한 영화 리뷰 페이지 조회")
    @GetMapping()
    public ResponseEntity<MovieReviewPageDto> findMovieReviews(@PathVariable("movieId") Long movieId){
        MovieReviewPageDto response = reviewService.findMovieReviews(movieId);
        return ResponseEntity.ok(response);
    }

}
