package backend.sookserver.domain.member.service;

import backend.sookserver.domain.login.exception.LoginException;
import backend.sookserver.domain.member.dto.MemberResponse;
import backend.sookserver.domain.member.entity.Member;
import backend.sookserver.domain.member.exception.MemberException;
import backend.sookserver.domain.member.repository.MemberRepository;
import backend.sookserver.global.error.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberResponse.MemberInformationResponse getMember(Long memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new BusinessException(LoginException.NOT_EXIST_MEMBER));

        return MemberResponse.MemberInformationResponse.of(member);
    }

    public void updateNickname(Long memberId, String nickname) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new BusinessException(LoginException.NOT_EXIST_MEMBER));

        member.update(nickname);
        memberRepository.save(member);
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

    public MemberResponse.MemberIdResponse getMemberIdByNickname(String nickname) {
        Member member = memberRepository.findByNickname(nickname)
                .orElseThrow(() -> new BusinessException(MemberException.NOT_EXIST_MEMBER));

        return  MemberResponse.MemberIdResponse.of(member.getId());
    }
}
