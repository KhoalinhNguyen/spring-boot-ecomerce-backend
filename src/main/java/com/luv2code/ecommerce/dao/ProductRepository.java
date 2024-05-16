package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {


    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
    //query method, match by category id, use "id" as parameter value
    // --> expose endpoint ../search/findByCategoryId?id=1

    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
    //Select * From Product p
    //Where
    //p.name LIKE CONCAT ('%', :name , '%')
}
