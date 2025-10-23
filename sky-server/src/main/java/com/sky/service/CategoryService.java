package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

public interface CategoryService {

    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    List<Category> getByType(Integer id);

    void insert(CategoryDTO categoryDTO);

    void deleteById(Long id);

    void  updateByIdAndStatus(Long id, Integer status);

    void update(CategoryDTO categoryDTO);

}
