package com.presupuestos.presupuestos.model;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Document
@CompoundIndexes({
        @CompoundIndex(name="category_idx", def="{'name':1,'categoryId':1}",unique = true)
})
public class Category {
    private Map<Locale, String> name;
    private Long categoryId;
    private List<Category> childCategory;

    public Map<Locale, String> getName() {
        return name;
    }

    public void setName(Map<Locale, String> name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public List<Category> getChildCategory() {
        return childCategory;
    }

    public void setChildCategory(List<Category> childCategory) {
        this.childCategory = childCategory;
    }

    public Category(Map<Locale, String> name, Long categoryId) {
        this.name = name;
        this.categoryId = categoryId;
    }

    public Category(){

    }
}
