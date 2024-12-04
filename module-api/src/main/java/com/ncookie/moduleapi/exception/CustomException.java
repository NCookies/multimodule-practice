package com.ncookie.moduleapi.exception;

import com.ncookie.modulecommon.enums.CodeEnum;
import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Description("다양한 예외 처리가 필요할 때, 이 객체에 담아서 리턴 해주기 위한 용도로 사용될 예정")
public class CustomException extends RuntimeException {
    private String returnCode;
    private String returnMessage;

    public CustomException(CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
    }

}
