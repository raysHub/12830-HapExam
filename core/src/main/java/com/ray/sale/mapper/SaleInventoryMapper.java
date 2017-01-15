package com.ray.sale.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.ray.sale.dto.SaleInventory;

import java.util.List;


public interface SaleInventoryMapper extends Mapper<SaleInventory> {

    List<SaleInventory> selectAllInventory(SaleInventory saleInventory);


}
