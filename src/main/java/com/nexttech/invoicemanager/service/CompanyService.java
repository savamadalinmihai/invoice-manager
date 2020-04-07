package com.nexttech.invoicemanager.service;

import com.nexttech.invoicemanager.persistance.CompanyRepository;
import com.nexttech.invoicemanager.persistance.InvoiceRepository;
import com.nexttech.invoicemanager.persistance.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyService.class);

    @Autowired
    private final CompanyRepository companyRepository;
    private final ProductRepository productRepository;
    private final InvoiceRepository invoiceRepository;

    public CompanyService(CompanyRepository companyRepository, ProductRepository productRepository,
                          InvoiceRepository invoiceRepository) {
        this.companyRepository = companyRepository;
        this.productRepository = productRepository;
        this.invoiceRepository = invoiceRepository;
    }


}
