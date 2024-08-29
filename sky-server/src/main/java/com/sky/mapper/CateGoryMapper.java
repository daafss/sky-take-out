package com.sky.mapper;

import com.sky.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: violet
 * Date: 2024/8/29 14:14
 */

@Mapper
public interface CateGoryMapper {
    void insert(Category category);
}
