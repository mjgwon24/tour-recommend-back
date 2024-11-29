package tour_recommend.tour_recommend_back.dto.campsite;

import lombok.Builder;

import java.util.List;

public class CampsiteDto {
    // 캠핑장 조회 응답
    @Builder
    public record FetchCampsiteResponse(
            Long id,
            String name,
            String location,
            String description,
            Double price,
            Double rating,
            String thumbnailPath
    ) {}

    // 캠핑장 목록 조회 응답
    @Builder
    public record FetchCampsitesResponse(
            List<FetchedCampsite> campsites,
            int currentPage,
            int totalPages,
            Long totalElements
    ) {
        @Builder
        public record FetchedCampsite(
                Long id,
                String name,
                String location,
                String description,
                Double price,
                Double rating,
                String thumbnailPath
        ) {}
    }
}