package com.ray.sale.service;


import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import com.ray.sale.dto.OrderHeader;
import com.ray.sale.dto.OrderLine;

import java.util.List;

public interface IOrderLineService extends IBaseService<OrderLine> {

    List<OrderLine> findInfo(IRequest request, OrderLine orderLine, int page, int pageSize);

}
