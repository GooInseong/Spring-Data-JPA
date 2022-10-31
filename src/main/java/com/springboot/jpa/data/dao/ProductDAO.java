package com.springboot.jpa.data.dao;

import com.springboot.jpa.data.entity.Product;

public interface ProductDAO {

    /*Data Access Object 는 데이터베이스에 접근하기 위한 로직을 관리하기 위한 객체이다. 비즈니스 로직의
    * 동작과 과정에서 데이터를 조작하는 기능을 DAO 객체가 수행한다. 다만 Spring Data JPA 에서 DAO의 개념을
    * Repository 객체가 대체하고있다. */

    Product insertProduct(Product product);

    Product selectProduct(Long number);

    Product updateProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
