package com.ray.sale.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import com.ray.sale.dto.SaleCompany;
import com.ray.sale.service.ISaleCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sale/company")
public class SaleCompanyController extends BaseController {
    @Autowired
    @Qualifier("companyService")
    ISaleCompanyService companyService;

    @RequestMapping(path = "/query" , method = RequestMethod.GET)
    public ResponseData query(HttpServletRequest request, SaleCompany company,
                              @RequestParam(name = "page", required = false, defaultValue = "1") int page,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "100") int pageSize) {
        IRequest requestContext = this.createRequestContext(request);
        return new ResponseData(companyService.select(requestContext,company, page, pageSize));
    }



}
