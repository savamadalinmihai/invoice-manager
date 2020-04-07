package com.nexttech.invoicemanager.persistance;

import com.nexttech.invoicemanager.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
