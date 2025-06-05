package com.example.opensource_server.movie.dto.response;

import com.example.opensource.review.dto.response.SummaryReviewResponseDTO;
import com.example.opensource_server.movie.domain.Movie;

public record FilteredMoviesResponseDTO(
        String title,
        String genre,
        String cast,
        String rating,
        SummaryReviewResponseDTO summaryReviewResponseDTO,
        String thumbnailUrl
) {
    public static FilteredMoviesResponseDTO from(Movie movie, SummaryReviewResponseDTO summaryReviewResponseDTO) {
        return new FilteredMoviesResponseDTO(
                movie.getTitle(),
                movie.getGenre(),
                movie.getCast(),
                movie.getMovieRating().getDisplayName(),
                summaryReviewResponseDTO,
                movie.getThumbnails().isEmpty() ? null : movie.getThumbnails().get(0).getUrl()
        );
    }
}
