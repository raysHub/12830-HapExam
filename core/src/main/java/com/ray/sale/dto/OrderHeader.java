package com.ray.sale.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ray on 2017/1/13.
 */

@ExtensionAttribute(
        disable = true
)
@Table(
        name = "hap_om_order_headers"
)
public class OrderHeader extends BaseDTO {

    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long headerId;

    @NotEmpty
    @Column
    private String orderNumber;

    @NotEmpty
    @Column
    private Long companyId;

    @NotEmpty
    @Column
    private Date orderDate;

    @NotEmpty
    @Column
    private String orderStatus;

    @NotEmpty
    @Column
    private Long customerId;

    @Transient
    private String customerNumber;

    @Transient
    private String customerName;

    @Transient
    private String companyName;

    @Transient
    private String companyNumber;

    @Transient
    private String itemCode;

    @Transient
    private String itemDescription;

    @Transient
    private Double orderAmount;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public OrderHeader setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public OrderHeader setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
        return this;
    }

    public String getItemCode() {
        return itemCode;
    }

    public OrderHeader setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public OrderHeader setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public OrderHeader setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public OrderHeader setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public OrderHeader setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public OrderHeader setHeaderId(Long headerId) {
        this.headerId = headerId;
        return this;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public OrderHeader setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public OrderHeader setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public OrderHeader setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public OrderHeader setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public OrderHeader setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
}
