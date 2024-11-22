package tour_recommend.tour_recommend_back.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tour_recommend.tour_recommend_back.dto.ResponseDto;
import tour_recommend.tour_recommend_back.dto.ResponseDto.Status;
import tour_recommend.tour_recommend_back.dto.SnsAuthPostDto.FetchSnsAuthPostsResponse;
import tour_recommend.tour_recommend_back.dto.SnsAuthPostDto.FetchSnsAuthPostResponse;
import tour_recommend.tour_recommend_back.dto.SnsAuthPostDto.CreateSnsAuthPostRequest;
import tour_recommend.tour_recommend_back.dto.SnsAuthPostDto.CreateSnsAuthPostResponse;
import tour_recommend.tour_recommend_back.service.SnsAuthPostService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sns-auth")
public class SnsAuthPostApi {
    private final SnsAuthPostService snsAuthPostService;

    @PostMapping("/posts")
    public ResponseEntity<ResponseDto<CreateSnsAuthPostResponse>> createSnsAuthPost(@RequestBody CreateSnsAuthPostRequest createSnsAuthPostRequest) {

        CreateSnsAuthPostResponse createSnsAuthPostResponse = snsAuthPostService.createSnsAuthPost(createSnsAuthPostRequest);

        return new ResponseEntity<>(
                new ResponseDto<>(Status.SUCCESS, "SNS 인증 게시글 등록 성공", createSnsAuthPostResponse),
                HttpStatus.OK
        );
    }

    @GetMapping("/posts/{postId}")
    public ResponseEntity<ResponseDto<FetchSnsAuthPostResponse>> fetchSnsAuthPost(@PathVariable Long postId) {

        FetchSnsAuthPostResponse fetchSnsAuthPostResponse = snsAuthPostService.fetchSnsAuthPost(postId);

        return new ResponseEntity<>(
                new ResponseDto<>(Status.SUCCESS, "SNS 인증 게시글 조회 성공", fetchSnsAuthPostResponse),
                HttpStatus.OK
        );
    }

    @GetMapping("/posts")
    public ResponseEntity<ResponseDto<FetchSnsAuthPostsResponse>> fetchSnsAuthPosts(@RequestParam(defaultValue = "0") int pageNumber,
                                                                                    @RequestParam(defaultValue = "10") int size) {
        FetchSnsAuthPostsResponse fetchSnsAuthPostsResponse = snsAuthPostService.fetchSnsAuthPosts(pageNumber, size);

        return new ResponseEntity<>(
                new ResponseDto<>(Status.SUCCESS, "SNS 인증 게시글 목록 조회 성공", fetchSnsAuthPostsResponse),
                HttpStatus.OK
        );
    }
}
