package com.ncookie.moduleapi.service;

import com.ncookie.moduleapi.exception.CustomException;
import com.ncookie.modulecommon.domain.Member;
import com.ncookie.modulecommon.enums.CodeEnum;
import com.ncookie.modulecommon.repository.MemberRepository;
import com.ncookie.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService;
    private final MemberRepository memberRepository;

    public String save() {
        memberRepository.save(
                Member.builder()
                        .name(Thread.currentThread().getName())
                        .build()
        );

        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        System.out.println("DB size: " + size);
        return "find";
    }

    public String exception() {
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }

}
