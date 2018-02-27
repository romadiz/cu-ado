package com.presupuestos.presupuestos.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Locale;
import java.util.Map;

@Document
public class Door {

    private Long doorId;
    private Map<Locale, String> name;
    private Category category;
    private Double price;
    private Integer number;

    public Long getDoorId() {
        return doorId;
    }

    public void setDoorId(Long doorId) {
        this.doorId = doorId;
    }

    public Map<Locale, String> getName() {
        return name;
    }

    public void setName(Map<Locale, String> name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Door(Long doorId, Map<Locale, String> name, Category category, Double price) {
        this.doorId = doorId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Door(){

    }
}
