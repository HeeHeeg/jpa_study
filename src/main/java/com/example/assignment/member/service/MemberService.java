package com.example.assignment.member.service;

import com.example.assignment.member.domain.entity.Member;
import com.example.assignment.member.domain.request.LoginRequest;
import com.example.assignment.member.domain.request.MemberRequest;
import com.example.assignment.member.domain.response.LoginResponse;
import com.example.assignment.member.domain.response.MemberResponse;
import com.example.assignment.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    private final MemberRepository memberRepository;

    public void signup(MemberRequest request) {
        Member signup = memberRepository.save(request.toEntity());
        log.info("SAVED ID: {}, SAVED NAME : {}, SAVED AGE : {}, SAVED PASSWORD : {}, SAVED EMAIL : {}",
                signup.getId(), signup.getName(), signup.getAge(), signup.getPassword(), signup.getEmail());
    }

    public LoginResponse login(LoginRequest request) {
        Member member = memberRepository.findByPasswordAndEmail(request.getPassword(), request.getEmail())
                .orElseThrow(() -> new RuntimeException("멤버 없어"));
        return new LoginResponse(member);
    }

    public Page<MemberResponse> findAll(PageRequest request) {
        Page<Member> all = memberRepository.findAll(request);
        return all.map(m->new MemberResponse(m));
    }

}
