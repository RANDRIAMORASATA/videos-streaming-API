package com.example.videoapi.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.videoapi.model.Category;
import com.example.videoapi.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Récupérer toutes les catégories
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Récupérer une catégorie par son id
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    // Ajouter une nouvelle catégorie
    public Category addCategory(Category category) {
        category.setCreatedAt(new Date()); // Ajoute la date de création
        category.setUpdatedAt(new Date()); // Ajoute la date de mise à jour
        return categoryRepository.save(category);
    }

    // Mettre à jour une catégorie existante
    public Category updateCategory(Long id, Category category) {
        if (categoryRepository.existsById(id)) {
            category.setId(id); // S'assurer que l'ID est bien celui de l'élément existant
            category.setUpdatedAt(new Date()); // Met à jour la date de modification
            return categoryRepository.save(category);
        }
        return null;
    }

    // Supprimer une catégorie
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}