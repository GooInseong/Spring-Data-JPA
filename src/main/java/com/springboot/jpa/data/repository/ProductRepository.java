package com.springboot.jpa.data.repository;

import com.springboot.jpa.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {// 대상 엔티티와 기본값 다입을 입력해야 함.

    /*SpringDataJPA는 JPA 를 편리하게 사용하게 사용할 수 있도록 지원하는 스프링 ㅎ사위 프로젝트 이다.
    * CRUD 처리에 필요한 인터페이스를 제공하며, 하이버네이트의 EntityManager 를 직접 다루지 않고
    * 리포지토리를 정의해 사용함으로써 스프링이 적합한 쿼리를 동적으로 생성하는 방식으로 데이터베이스를 조작.*/

}
