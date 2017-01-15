package com.ray.sale.service;


import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import com.ray.sale.dto.OrderHeader;

import java.util.List;

public interface IOrderHeaderService extends IBaseService<OrderHeader> {

    List<OrderHeader> findInfo(IRequest request, OrderHeader order, int page, int pageSize);

}
