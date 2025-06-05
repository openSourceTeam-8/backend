package com.example.opensource_server.review.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewCreateRequestDto {
    private String nickname; // 리뷰 작성자 닉네임
    private String reviewContents; // 작성할 리뷰 내용
}
