package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * Author: violet
 * Date: 2024/9/2 16:03
 */
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
