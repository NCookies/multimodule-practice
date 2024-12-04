package com.ncookie.modulecommon.repository;

import com.ncookie.modulecommon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
