package backend.sookserver.domain.login.dto;

import backend.sookserver.domain.member.entity.MemberType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class LoginRequest {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUp{

        @Schema(example = "KAKAO")
        private MemberType memberType;
        @Schema(example = "장지효")
        private String nickname;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CheckNickname{
        @Schema(example = "장지효")
        private String nickname;
    }

}
