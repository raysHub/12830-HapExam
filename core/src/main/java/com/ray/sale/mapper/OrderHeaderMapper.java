package com.ray.sale.mapper;


import com.hand.hap.mybatis.common.Mapper;
import com.ray.sale.dto.OrderHeader;

import java.util.List;

public interface OrderHeaderMapper extends Mapper<OrderHeader> {

    List<OrderHeader> findInfo(OrderHeader order);
}
