package com.presupuestos.presupuestos.repository;

import com.presupuestos.presupuestos.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>, CategoryCustomRepository {
    public Category findByCategoryId(Long categoryId);
    public List<Category> findByChildCategory(List<Category> childCategory);
    public void delete(Category category);
    public void deleteAll();
    public List<Category> findAll();
    public Category save(Category category);
    public List<Category> save(List<Category> categories);
}
