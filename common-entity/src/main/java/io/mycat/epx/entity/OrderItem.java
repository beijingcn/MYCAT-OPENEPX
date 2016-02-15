package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 单品ID
     */
    @Column(name = "itemId")
    private Long itemid;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品全名
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * 是否赠品
     */
    @Column(name = "is_gift")
    private Boolean isGift;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 退货数量
     */
    @Column(name = "return_quantity")
    private Integer returnQuantity;

    /**
     * 发货数量
     */
    @Column(name = "shipped_quantity")
    private Integer shippedQuantity;

    /**
     * 商品小图
     */
    private String thumbnail;

    /**
     * 重量
     */
    private Integer weight;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

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
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取单品ID
     *
     * @return itemId - 单品ID
     */
    public Long getItemid() {
        return itemid;
    }

    /**
     * 设置单品ID
     *
     * @param itemid 单品ID
     */
    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取商品全名
     *
     * @return full_name - 商品全名
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置商品全名
     *
     * @param fullName 商品全名
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * 获取是否赠品
     *
     * @return is_gift - 是否赠品
     */
    public Boolean getIsGift() {
        return isGift;
    }

    /**
     * 设置是否赠品
     *
     * @param isGift 是否赠品
     */
    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取数量
     *
     * @return quantity - 数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     *
     * @param quantity 数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取退货数量
     *
     * @return return_quantity - 退货数量
     */
    public Integer getReturnQuantity() {
        return returnQuantity;
    }

    /**
     * 设置退货数量
     *
     * @param returnQuantity 退货数量
     */
    public void setReturnQuantity(Integer returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    /**
     * 获取发货数量
     *
     * @return shipped_quantity - 发货数量
     */
    public Integer getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * 设置发货数量
     *
     * @param shippedQuantity 发货数量
     */
    public void setShippedQuantity(Integer shippedQuantity) {
        this.shippedQuantity = shippedQuantity;
    }

    /**
     * 获取商品小图
     *
     * @return thumbnail - 商品小图
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 设置商品小图
     *
     * @param thumbnail 商品小图
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
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
}