package tour_recommend.tour_recommend_back.dto;

import lombok.Builder;
import tour_recommend.tour_recommend_back.entity.SnsAuthPost;

import java.time.LocalDateTime;
import java.util.List;

public record SnsAuthPostDto () {
    @Builder
    public record CreateSnsAuthPostRequest(
            String snsUserName,
            String phoneNumber,
            String email,
            String title,
            String contents,
            List<String> imagePathList
    ) {
        public SnsAuthPost toEntity() {
            return SnsAuthPost.builder()
                    .snsUserName(this.snsUserName)
                    .phoneNumber(this.phoneNumber)
                    .email(this.email)
                    .title(this.title)
                    .contents(this.contents)
                    .imagePathList(this.imagePathList)
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .build();
        }
    }

    @Builder
    public record CreateSnsAuthPostResponse(
            Long id,
            String snsUserName,
            String phoneNumber,
            String email,
            String title,
            String contents,
            List<String> imagePathList,
            LocalDateTime createAt,
            LocalDateTime updateAt
    ) {}
}