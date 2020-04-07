package com.nexttech.invoicemanager.persistance;

import com.nexttech.invoicemanager.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
