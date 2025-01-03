package backend.sookserver.global.error;

import org.springframework.http.HttpStatus;

public interface ErrorCode {
    HttpStatus getHttpStatus();

    String getErrorCode();

    String getMessage();
}
