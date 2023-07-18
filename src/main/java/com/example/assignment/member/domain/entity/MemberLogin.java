package com.example.assignment.member.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "member_longin")
public class MemberLogin {
    @Id @GeneratedValue
    private Long id;
    @OneToOne
    private Member member;
    private LocalDateTime createAt;
    private LocalDateTime endAt;
}
