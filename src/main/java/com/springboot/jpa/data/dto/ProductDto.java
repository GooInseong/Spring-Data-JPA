package com.springboot.jpa.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    /* 본 DTO 클래스는 클라이언트로부터 정보를 받아올때(Request) 사용되는 Dto이다.
    * Product 엔티티에 number 값은 필요 없음으로 필수요소인 name,price,stock 만을
    * 전달한다. */
    private String name;
    private int price;
    private int stock;

}
