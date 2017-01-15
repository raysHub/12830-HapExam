package com.ray.sale.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import com.ray.sale.dto.OrderHeader;
import com.ray.sale.dto.OrderLine;
import com.ray.sale.service.IOrderHeaderService;
import com.ray.sale.service.IOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/sale/order")
public class OrderController extends BaseController {
    @Autowired
    IOrderLineService orderLineService;

    @Autowired
    IOrderHeaderService orderHeaderService;



    /**
     * @param page        pageNow
     * @param pageSize    pageSize
     * @return 传输到前台的数据
     */
    @RequestMapping(path = "/query" , method = RequestMethod.POST)
    public ResponseData query(HttpServletRequest request, OrderHeader order,
                              @RequestParam(name = "page", required = false, defaultValue = "1") int page,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        IRequest requestContext = this.createRequestContext(request);
        return new ResponseData(orderHeaderService.findInfo(requestContext, order, page, pageSize));
    }


    /**
     * 处理增删改请求
     * @param orders 订单信息
     * @param result
     * @param request
     * @return
     */
    @RequestMapping(path = "/submit", method = RequestMethod.POST)
    public ResponseData submit(@RequestBody List<OrderHeader> orders, BindingResult result, HttpServletRequest request) {
        this.getValidator().validate(orders, result);
        if(result.hasErrors()) {
            ResponseData ErrorRequestContext = new ResponseData(false);
            ErrorRequestContext.setMessage(this.getErrorMessage(result, request));
            return ErrorRequestContext;
        } else {
            IRequest requestContext = this.createRequestContext(request);
            return new ResponseData(orderHeaderService.batchUpdate(requestContext, orders));
        }
    }


    @RequestMapping(path = "/queryLines" , method = RequestMethod.POST)
    public ResponseData queryLines(HttpServletRequest request, OrderLine orderLine,
                              @RequestParam(name = "page", required = false, defaultValue = "1") int page,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        IRequest requestContext = this.createRequestContext(request);
        return new ResponseData(orderLineService.findInfo(requestContext, orderLine, page, pageSize));
    }






}
