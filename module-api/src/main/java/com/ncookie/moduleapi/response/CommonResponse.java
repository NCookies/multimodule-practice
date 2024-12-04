package com.ncookie.moduleapi.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ncookie.modulecommon.enums.CodeEnum;
import lombok.*;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)  // null이 아닌 필드만 보여주는 옵션. 만약 필드 중 null 값이 있다면 해당 필드는 데이터에 포함시키지 않는다.
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {
    private String returnCode;
    private String returnMessage;
    private T info;

    public CommonResponse(CodeEnum codeEnum) {
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
    }

    public CommonResponse(T info) {
        setReturnCode(CodeEnum.SUCCESS.getCode());
        setReturnMessage(CodeEnum.SUCCESS.getMessage());
        setInfo(info);
    }

    public CommonResponse(CodeEnum codeEnum, T info) {
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
        setInfo(info);
    }
}
