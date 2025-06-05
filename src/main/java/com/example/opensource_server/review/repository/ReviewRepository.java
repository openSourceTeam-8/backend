package com.example.opensource_server.review.repository;

import com.example.opensource_server.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
