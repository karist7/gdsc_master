package com.example.gdsc.data.repository;

import com.example.gdsc.data.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

//예제 9.2
public interface ProductDetailRepository extends JpaRepository<ProductDetail,Long> {
}
