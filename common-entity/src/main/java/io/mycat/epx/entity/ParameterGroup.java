package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_parameter_group")
public class ParameterGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 排序
     */
    private Integer orders;

    /**
     * 名称
     */
    private String name;

    /**
     * 绑定分类
     */
    @Column(name = "product_category")
    private Long productCategory;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取绑定分类
     *
     * @return product_category - 绑定分类
     */
    public Long getProductCategory() {
        return productCategory;
    }

    /**
     * 设置绑定分类
     *
     * @param productCategory 绑定分类
     */
    public void setProductCategory(Long productCategory) {
        this.productCategory = productCategory;
    }
}