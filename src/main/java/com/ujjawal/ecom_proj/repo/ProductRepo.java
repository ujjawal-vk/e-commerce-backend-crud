package com.ujjawal.ecom_proj.repo;

import com.ujjawal.ecom_proj.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {

    @Query("SELECT p FROM Products p WHERE " + "LOWER(p.prodName) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Products> searchProduct(String keyword);
}
