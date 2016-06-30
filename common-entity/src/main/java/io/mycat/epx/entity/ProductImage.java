package io.mycat.epx.entity;

import javax.persistence.*;

@Table(name = "shop_product_image")
public class ProductImage {
    /**
     * 产品ID
     */
    private Long product;

    /**
     * 大图
     */
    private String large;

    /**
     * 中图
     */
    private String medium;

    /**
     * 排序
     */
    private Integer orders;

    /**
     * 原图
     */
    private String source;

    /**
     * 缩略图
     */
    private String thumbnail;

    /**
     * 标题
     */
    private String title;

    /**
     * 获取产品ID
     *
     * @return product - 产品ID
     */
    public Long getProduct() {
        return product;
    }

    /**
     * 设置产品ID
     *
     * @param product 产品ID
     */
    public void setProduct(Long product) {
        this.product = product;
    }

    /**
     * 获取大图
     *
     * @return large - 大图
     */
    public String getLarge() {
        return large;
    }

    /**
     * 设置大图
     *
     * @param large 大图
     */
    public void setLarge(String large) {
        this.large = large == null ? null : large.trim();
    }

    /**
     * 获取中图
     *
     * @return medium - 中图
     */
    public String getMedium() {
        return medium;
    }

    /**
     * 设置中图
     *
     * @param medium 中图
     */
    public void setMedium(String medium) {
        this.medium = medium == null ? null : medium.trim();
    }

    /**
     * 获取排序
     *
     * @return orders - 排序
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置排序
     *
     * @param orders 排序
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取原图
     *
     * @return source - 原图
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置原图
     *
     * @param source 原图
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取缩略图
     *
     * @return thumbnail - 缩略图
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 设置缩略图
     *
     * @param thumbnail 缩略图
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}