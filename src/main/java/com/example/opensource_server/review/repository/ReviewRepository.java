package com.example.opensource_server.review.repository;

import com.example.opensource_server.movie.domain.Movie;
import com.example.opensource_server.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    Optional<Review> findFirstByMovieOrderByCreatedAtDesc(Movie movie);

}
