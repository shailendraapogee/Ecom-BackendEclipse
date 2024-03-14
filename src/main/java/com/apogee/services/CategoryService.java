package com.apogee.services;

import java.util.List;

import com.apogee.payload.CategoryDto;

public interface CategoryService {

	public CategoryDto createCategory(CategoryDto categoryDto);

	public CategoryDto updateCategory(CategoryDto categoryDto, int categoryId);

	public void deleteCategory(int categoryId);

	public CategoryDto getCategoryById(int categoryId);

	public List<CategoryDto> getAllCategory();
}
