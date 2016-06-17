package io.mycat.epx.entity;

import javax.persistence.*;

@Table(name = "shop_product_specification_value")
public class ProductSpecificationValueRel {
    /**
     * 产品ID
     */
    @Id
    private Long products;

    /**
     * 规格值ID
     */
    @Id
    @Column(name = "specification_values")
    private Long specificationValues;

    /**
     * 获取产品ID
     *
     * @return products - 产品ID
     */
    public Long getProducts() {
        return products;
    }

    /**
     * 设置产品ID
     *
     * @param products 产品ID
     */
    public void setProducts(Long products) {
        this.products = products;
    }

    /**
     * 获取规格值ID
     *
     * @return specification_values - 规格值ID
     */
    public Long getSpecificationValues() {
        return specificationValues;
    }

    /**
     * 设置规格值ID
     *
     * @param specificationValues 规格值ID
     */
    public void setSpecificationValues(Long specificationValues) {
        this.specificationValues = specificationValues;
    }
}