package com.springboot.jpa.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "name")
@Table(name = "product")
public class Product {

    /* Product Entity 이다.*/

    @Id //@Id 는 본 column이 기본값(primary key) 임을 명시한다
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue 해당 필드의 값을 어떠한식(Identity:Auto-Increment)으로 자동생성할지 명시한다.
    private Long number;

    @Column(nullable = false) //@Column 엔티티의 필드는 자동으로 테이블명과 매치가되지만, not null 이나 특별히 테이블 네이밍을 해줘야 할 경우 사용한다.(안써도 됨)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;


    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
