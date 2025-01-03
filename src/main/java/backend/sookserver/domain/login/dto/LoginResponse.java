package backend.sookserver.domain.login.dto;

import backend.sookserver.domain.member.entity.Member;
import backend.sookserver.domain.member.entity.MemberType;
import lombok.*;

public class LoginResponse {
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MemberInformationResponse {
        private Long memberId;
        private String email;
        private String nickname;
        private MemberType memberType;

        public static MemberInformationResponse of (Member member){
            return MemberInformationResponse.builder()
                    .memberId(member.getId())
                    .email(member.getEmail())
                    .nickname(member.getNickname())
                    .memberType(member.getMemberType())
                    .build();
        }
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MemberIdResponse{
        private Long memberId;

        public static MemberIdResponse of (Long memberId){
            return MemberIdResponse.builder()
                    .memberId(memberId)
                    .build();
        }
    }

}
