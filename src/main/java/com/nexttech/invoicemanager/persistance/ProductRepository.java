package com.nexttech.invoicemanager.persistance;

import com.nexttech.invoicemanager.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
