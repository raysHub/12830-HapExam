package com.ray.sale.service.impl;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import com.ray.sale.dto.SaleCompany;
import com.ray.sale.mapper.SaleCompanyMapper;
import com.ray.sale.service.ISaleCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ray on 2017/1/13.
 */
@Service("companyService")
public class SaleServiceImpl extends BaseServiceImpl<SaleCompany> implements ISaleCompanyService {

    @Autowired
    private SaleCompanyMapper companyMapper;

    public List<SaleCompany> query(IRequest request, SaleCompany company, int page, int pageSize){
        return companyMapper.select(company);

    }

}
