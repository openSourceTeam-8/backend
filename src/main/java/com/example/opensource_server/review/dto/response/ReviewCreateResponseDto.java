package com.example.opensource_server.review.dto.response;

import com.example.opensource_server.review.domain.Review;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "리뷰 작성 후 화면에 표시되는 응답 DTO")
public class ReviewCreateResponseDto {
    private LocalDateTime createdAt;
    private String nickname;
    private String reviewContents;
    private int score;  //영화 별점

    // Review 엔티티를 ReviewCreateResponseDto로 변환
    public static ReviewCreateResponseDto fromEntity(Review review) {
        return ReviewCreateResponseDto.builder()
                .createdAt(review.getCreatedAt())
                .nickname(review.getNickname())
                .reviewContents(review.getReviewContents())
                .score(review.getScore())
                .build();
    }
}
