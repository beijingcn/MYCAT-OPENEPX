package io.mycat.epx.entity;

import javax.persistence.*;

@Table(name = "shop_product_specification")
public class ProductSpecification {
    /**
     * 产品ID
     */
    @Id
    private Long products;

    /**
     * 规格ID
     */
    @Id
    private Long specifications;

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
     * 获取规格ID
     *
     * @return specifications - 规格ID
     */
    public Long getSpecifications() {
        return specifications;
    }

    /**
     * 设置规格ID
     *
     * @param specifications 规格ID
     */
    public void setSpecifications(Long specifications) {
        this.specifications = specifications;
    }
}