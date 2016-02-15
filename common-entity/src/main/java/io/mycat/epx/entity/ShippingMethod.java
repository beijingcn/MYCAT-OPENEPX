package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_shipping_method")
public class ShippingMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 发货方式名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer orders;

    /**
     * 费用
     */
    private BigDecimal price;

    /**
     * 重量
     */
    private Integer weight;

    /**
     * 图标
     */
    private String icon;

    /**
     * 关联快递公司ID
     */
    @Column(name = "default_delivery_corp")
    private Long defaultDeliveryCorp;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 描述
     */
    private String description;

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
     * 获取发货方式名称
     *
     * @return name - 发货方式名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置发货方式名称
     *
     * @param name 发货方式名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 获取费用
     *
     * @return price - 费用
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置费用
     *
     * @param price 费用
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取重量
     *
     * @return weight - 重量
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置重量
     *
     * @param weight 重量
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取关联快递公司ID
     *
     * @return default_delivery_corp - 关联快递公司ID
     */
    public Long getDefaultDeliveryCorp() {
        return defaultDeliveryCorp;
    }

    /**
     * 设置关联快递公司ID
     *
     * @param defaultDeliveryCorp 关联快递公司ID
     */
    public void setDefaultDeliveryCorp(Long defaultDeliveryCorp) {
        this.defaultDeliveryCorp = defaultDeliveryCorp;
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
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}