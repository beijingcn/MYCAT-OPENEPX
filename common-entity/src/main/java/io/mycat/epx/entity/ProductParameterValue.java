package io.mycat.epx.entity;

import javax.persistence.*;

@Table(name = "shop_product_parameter_value")
public class ProductParameterValue {
    @Id
    private Long product;

    @Id
    @Column(name = "parameter_value_key")
    private Long parameterValueKey;

    @Column(name = "parameter_value")
    private String parameterValue;

    /**
     * @return product
     */
    public Long getProduct() {
        return product;
    }

    /**
     * @param product
     */
    public void setProduct(Long product) {
        this.product = product;
    }

    /**
     * @return parameter_value_key
     */
    public Long getParameterValueKey() {
        return parameterValueKey;
    }

    /**
     * @param parameterValueKey
     */
    public void setParameterValueKey(Long parameterValueKey) {
        this.parameterValueKey = parameterValueKey;
    }

    /**
     * @return parameter_value
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * @param parameterValue
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue == null ? null : parameterValue.trim();
    }
}