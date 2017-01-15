package com.ray.sale.mapper;


import com.hand.hap.mybatis.common.Mapper;
import com.ray.sale.dto.SaleCustomer;

import java.util.List;

public interface SaleCustomerMapper extends Mapper<SaleCustomer> {

    List<SaleCustomer> selectAllCustomer(SaleCustomer customer);

}
