package com.yoon.hotplace.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
