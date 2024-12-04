package com.ncookie.moduleapi.exceptionHandler;

import com.ncookie.moduleapi.exception.CustomException;
import com.ncookie.moduleapi.response.CommonResponse;
import com.ncookie.modulecommon.enums.CodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public CommonResponse handleException(CustomException e) {
        return CommonResponse.builder()
                .returnCode(e.getReturnCode())
                .returnMessage(e.getReturnMessage())
                .build();
    }

    // 미처 놓친 예외들을 처리하기 위해 사용
    @ExceptionHandler(Exception.class)
    public CommonResponse handleException(Exception e) {
        return CommonResponse.builder()
                .returnCode(CodeEnum.UNKNOWN_ERROR.getCode())
                .returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage())
                .build();
    }

}
