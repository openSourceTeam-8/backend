package com.example.opensource_server.review.controller;

import com.example.opensource_server.review.dto.response.MovieReviewPageDto;
import com.example.opensource_server.review.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("{movieId}/review")// 리뷰 달고 싶은 특정 영화(리뷰)페이지에 접속한 후
public class ReviewController {
    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    // 리뷰 달고 싶은 영화 리뷰 페이지 접속하면 보이는 기본 화면
    // 하나의 특정 영화에 달린 리뷰 확인하는 페이지
    @GetMapping()
    public ResponseEntity<MovieReviewPageDto> findMovieReviews(@PathVariable("movieId") Long movieId){
        MovieReviewPageDto response = reviewService.findMovieReviews(movieId);
        return ResponseEntity.ok(response);
    }
}
