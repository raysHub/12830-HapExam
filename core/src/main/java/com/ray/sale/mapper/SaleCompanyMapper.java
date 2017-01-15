package com.ray.sale.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.ray.sale.dto.SaleCompany;

import java.util.List;

/**
 * Created by ray on 2017/1/13.
 */
public interface SaleCompanyMapper extends Mapper<SaleCompany> {

    List<SaleCompany> selectAllCompany(SaleCompany company);


}
