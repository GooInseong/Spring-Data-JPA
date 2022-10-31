package com.springboot.jpa.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ChangeProductNameDto {

    /* Product 이름만 수정하는 메서드에는 findById()에 사용할 number 와
    * 새로 바꿔줄(save) name 값만 필요하기 때문에 목적에 맞게 ChangedProductNameDto 를 생성했다..*/
    private Long number;
    private String name;
}
