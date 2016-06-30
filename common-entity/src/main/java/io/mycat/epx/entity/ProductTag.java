package io.mycat.epx.entity;

import javax.persistence.*;

@Table(name = "shop_product_tag")
public class ProductTag {
    @Id
    private Long products;

    @Id
    private Long tags;

    /**
     * @return products
     */
    public Long getProducts() {
        return products;
    }

    /**
     * @param products
     */
    public void setProducts(Long products) {
        this.products = products;
    }

    /**
     * @return tags
     */
    public Long getTags() {
        return tags;
    }

    /**
     * @param tags
     */
    public void setTags(Long tags) {
        this.tags = tags;
    }
}