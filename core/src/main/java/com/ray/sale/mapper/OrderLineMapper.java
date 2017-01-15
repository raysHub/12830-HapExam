package com.ray.sale.mapper;


import com.hand.hap.mybatis.common.Mapper;
import com.ray.sale.dto.OrderHeader;
import com.ray.sale.dto.OrderLine;

import java.util.List;

public interface OrderLineMapper extends Mapper<OrderLine> {

    List<OrderLine> findLineInfo(OrderLine orderLine);
}
