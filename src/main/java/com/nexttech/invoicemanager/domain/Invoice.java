package com.nexttech.invoicemanager.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Entity
public class Invoice {
    @Id
    private long id;
    @NotNull
    @GeneratedValue
    private long invoiceNumber;
    @NotNull
    private String seller;
    private double total;
    private LocalDate dueDate;
    private LocalDate payDate;
    @ElementCollection
    private List<String> invoices = new ArrayList<>();
    private Company company;
    private Product product;
    Random random;
    private double totalForCurrentInvoice;

    public void generateInvoices(){
        int counter = 1;
        for (Company company : company.companies){
            List<Product> pickedProducts = new ArrayList<>();
            seller = company.getName();
            int numberOfProductsToPick = random.nextInt(3);
            for (int j = 1; j <= numberOfProductsToPick; j++){
                Product currentlyPickedProduct = product.getProducts().get(random.nextInt(product.getProducts().size()));
                pickedProducts.add(currentlyPickedProduct);
            }
            for (Product product : pickedProducts){
                totalForCurrentInvoice += product.getPrice();
            }
            total = totalForCurrentInvoice;
            dueDate = LocalDate.now().plusDays(random.nextInt(5));
            if (counter % 10 != 0) {
                payDate = LocalDate.now().minusDays(random.nextInt(5));
            }else{
                payDate = null;
            }
            counter++;
        }
    }

    public long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDate payDate) {
        this.payDate = payDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber=" + invoiceNumber +
                ", seller='" + seller + '\'' +
                ", total=" + total +
                ", dueDate=" + dueDate +
                ", payDate=" + payDate +
                ", random=" + random +
                '}';
    }
}
