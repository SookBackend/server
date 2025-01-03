package backend.sookserver.domain.member.exception;

import backend.sookserver.global.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum MemberException implements ErrorCode {
    NOT_EXIST_MEMBER(HttpStatus.NOT_FOUND, "MM-001", "존재하지 않는 회원입니다."),
    NOT_VERIFY_MEMBET_WITH_TOKEN(HttpStatus.UNAUTHORIZED,"MM-002", "회원정보와 토큰정보가 일치하지 않습니다."),
    INVAILD_IMAGE_FILE(HttpStatus.UNAUTHORIZED,"MM-003", "존재하지 않는 이미지 파일입니다."),
    NOT_MATCH_MEMBER(HttpStatus.UNAUTHORIZED,"MM-004", "잘못된 접근입니다.");

    private final HttpStatus httpStatus;
    private final String errorCode;
    private final String message;
}
