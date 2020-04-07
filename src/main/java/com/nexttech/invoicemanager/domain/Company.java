package com.nexttech.invoicemanager.domain;

import java.util.*;

public class Company {
    private String name;
    private String phoneNumber;
    private Random random;
    List<Company> companies = new ArrayList<>();
    List<String> stringsForNameGenerating = new ArrayList<>();

    public void generateCompanyNames(){
        stringsForNameGenerating.add("Royal");
        stringsForNameGenerating.add("Romanian");
        stringsForNameGenerating.add("European");
        stringsForNameGenerating.add("Snack");
        stringsForNameGenerating.add("Beverage");
        stringsForNameGenerating.add("Food");
        stringsForNameGenerating.add("Company");
        stringsForNameGenerating.add("Incorporated");


        for(int i = 1; i <= 24; i++){
            int index1 = random.nextInt(8);
            int index2 = random.nextInt(8);
            int index3 = random.nextInt(8);
            StringBuilder company = new StringBuilder();
            String firstPart;
            String secondPart;
            String thirdPart;
            firstPart = stringsForNameGenerating.get(index1);
            company.append(firstPart);
            secondPart = stringsForNameGenerating.get(index2);
            while (firstPart.equals(secondPart)){
                index2 = random.nextInt(8);
                secondPart = stringsForNameGenerating.get(index2);
            }
            company.append(secondPart);
            thirdPart = stringsForNameGenerating.get(index3);
            while (firstPart.equals(secondPart) || secondPart.equals(thirdPart)){
                index3 = random.nextInt(8);
                thirdPart = stringsForNameGenerating.get(index3);
            }
            company.append(thirdPart);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
