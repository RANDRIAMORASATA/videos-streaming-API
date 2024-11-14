package com.example.videoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.videoapi.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
