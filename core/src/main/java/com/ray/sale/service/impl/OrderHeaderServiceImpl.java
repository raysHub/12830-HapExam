package com.ray.sale.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.message.IMessagePublisher;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import com.ray.sale.mapper.OrderHeaderMapper;
import com.ray.sale.dto.OrderHeader;
import com.ray.sale.service.IOrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderHeaderService")
public class OrderHeaderServiceImpl extends BaseServiceImpl<OrderHeader> implements IOrderHeaderService {

    @Autowired
    private OrderHeaderMapper orderHeaderMapper;
    @Autowired
    private IMessagePublisher messagePublisher;

    @Override
    public List<OrderHeader> findInfo(IRequest request, OrderHeader order, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return orderHeaderMapper.findInfo(order);
    }

}
