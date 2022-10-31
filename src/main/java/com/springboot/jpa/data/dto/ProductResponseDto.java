package com.springboot.jpa.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter
public class ProductResponseDto {

    /* ProductResponseDto 는 Product 객체를 DB에서 가져와 응답(Response) 해 줄 때 사용한다.
    * ProductDto 와는 다르게 저장된 값을 가져오기에 number(Primarykey,Auto_increment)를 포함한다.*/
    private Long number;
    private String name;
    private int price;
    private int stock;
}
