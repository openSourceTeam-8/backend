package com.example.opensource_server.review.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "리뷰 생성 요청 DTO")
public class ReviewCreateRequestDto {
    private String nickname; // 리뷰 작성자 닉네임
    private String reviewContents; // 작성할 리뷰 내용
    @Schema(description = "영화 별점 (0-10점)", example = "5")
    private int score;  //영화 별점
}
