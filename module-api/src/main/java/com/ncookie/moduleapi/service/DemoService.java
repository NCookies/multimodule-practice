package com.ncookie.moduleapi.service;

import com.ncookie.modulecommon.enums.CodeEnum;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        return "save";
    }

    public String find() {
        return "find";
    }

}
