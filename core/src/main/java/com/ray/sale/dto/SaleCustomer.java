package com.ray.sale.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ray on 2017/1/14.
 */
@ExtensionAttribute(
        disable = true
)
@Table(
        name = "hap_ar_customers"
)
public class SaleCustomer extends BaseDTO {

    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long customerId;

    @NotEmpty
    @Column
    private String customerNumber;

    @NotEmpty
    @Column
    private String customerName;

    @NotEmpty
    @Column
    private Long companyId;

    @NotEmpty
    @Column
    private String enabledFlag;

    @Column
    private Date creationDate;

    @Column
    private Long createdBy;

    @Column
    private Long lastUpdateBy;

    @Column
    private Date lastUpdateDate;

    @Column
    private Long lastUpdateLogin;

    public Long getCustomerId() {
        return customerId;
    }

    public SaleCustomer setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public SaleCustomer setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public SaleCustomer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public SaleCustomer setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public SaleCustomer setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
        return this;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public Long getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public SaleCustomer setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
        return this;
    }

    @Override
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    @Override
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    @Override
    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }
}
