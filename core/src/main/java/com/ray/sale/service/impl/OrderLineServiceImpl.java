package com.ray.sale.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.message.IMessagePublisher;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import com.ray.sale.dto.OrderHeader;
import com.ray.sale.dto.OrderLine;
import com.ray.sale.mapper.OrderHeaderMapper;
import com.ray.sale.mapper.OrderLineMapper;
import com.ray.sale.service.IOrderHeaderService;
import com.ray.sale.service.IOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderLineService")
public class OrderLineServiceImpl extends BaseServiceImpl<OrderLine> implements IOrderLineService {

    @Autowired
    private OrderLineMapper orderLineMapper;
    @Autowired
    private IMessagePublisher messagePublisher;

    @Override
    public List<OrderLine> findInfo(IRequest request, OrderLine orderLine, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return orderLineMapper.findLineInfo(orderLine);
    }

}
