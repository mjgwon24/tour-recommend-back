package tour_recommend.tour_recommend_back.dto;

public record ResponseDto<T>(
        Status status,
        String msg,
        T data
) {
    public enum Status {
        SUCCESS, FAILURE
    }
}
