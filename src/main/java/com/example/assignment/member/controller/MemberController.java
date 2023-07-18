package com.example.assignment.member.controller;

import com.example.assignment.member.domain.entity.Member;
import com.example.assignment.member.domain.request.LoginRequest;
import com.example.assignment.member.domain.request.MemberRequest;
import com.example.assignment.member.domain.response.LoginResponse;
import com.example.assignment.member.domain.response.MemberResponse;
import com.example.assignment.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberController {
    private final MemberService memberService;


    @PostMapping("signup")
    public void signup(@RequestBody MemberRequest request) {
        memberService.signup(request);
    }

    @PostMapping("login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return memberService.login(request);
    }

    @GetMapping
    public Page<MemberResponse> getAll(@RequestParam(name = "size",required = false, defaultValue = "10") Integer size,
                                       @RequestParam(name = "page",required = false, defaultValue = "0") Integer page){
        PageRequest request = PageRequest.of(page, size);
        return memberService.findAll(request);
    }


}
