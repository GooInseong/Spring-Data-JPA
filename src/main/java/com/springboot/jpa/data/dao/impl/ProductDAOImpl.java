package com.springboot.jpa.data.dao.impl;

import com.springboot.jpa.data.dao.ProductDAO;
import com.springboot.jpa.data.entity.Product;
import com.springboot.jpa.data.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.apache.el.util.ExceptionUtils;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.OptionalInt;

@Component
@AllArgsConstructor
public class ProductDAOImpl implements ProductDAO {


    private final ProductRepository productRepository;


    @Override
    public Product insertProduct(Product product) {
        Product savedProduct= productRepository.save(product);
        return savedProduct;
    }

    @Override
    public Product selectProduct(Long number) {
        Product selectedProduct= productRepository.getById(number);
        return selectedProduct;
    }

    /* getById(): 내부적으로 Entity Manager 의 getReference() 메서드를 호출한다. 해당 메소드를 호출하면
    * 프락시 객체를 리턴한다. 실제 쿼리는 프락시 객체를 통해 최초로 데이터에 접근하는 시점에 실행된다.*/

    @Override
    public Product updateProductName(Long number, String name) throws Exception {
        Optional<Product> selectedProduct = productRepository.findById(number);

        Product updatedProduct;
        if (selectedProduct.isPresent()) {
            Product product = selectedProduct.get();

            product.setName(name);
            product.setUpdatedAt(LocalDateTime.now());

            updatedProduct = productRepository.save(product);
        } else {
            throw new Exception();
        }

        return updatedProduct;
    }
    /* findById(): 내부적으로 Entity Manager 의 find() 메서드를 호출한다. 이 메서드는 영속성 컨텍스트의
    * 캐시에서 값을 조회한 후 영속성 컨텍스트에 값이 존재하지 않는다면 실제 데이터베이스에서 데이터를 조회한다.
    * return 값으로는 Optional<>객체를 전달한다.*/

    @Override
    public void deleteProduct(Long number) throws Exception {
        Optional<Product> selectedProduct= productRepository.findById(number);

        if(selectedProduct.isPresent()){
            Product product= selectedProduct.get();
            productRepository.delete(product);
        }else{
            throw new Exception();
        }
    }
}
