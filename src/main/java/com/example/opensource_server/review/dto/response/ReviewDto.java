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
@Schema(description = "단일 리뷰 정보 DTO")
public class ReviewDto {    //리뷰 페이지 조회 시 보이는 리뷰 각각의 dto.
    private String nickname;
    private String reviewContents;
    private LocalDateTime createdAt;
    private int score;  //영화 별점

    public static ReviewDto fromEntity(Review review) {
        return ReviewDto.builder()
                .nickname(review.getNickname())
                .reviewContents(review.getReviewContents())
                .createdAt(review.getCreatedAt())
                .score(review.getScore())
                .build();
    }
}
