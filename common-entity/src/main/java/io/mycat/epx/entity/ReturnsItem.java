package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_returns_item")
public class ReturnsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 退货单ID
     */
    @Column(name = "returns_id")
    private Long returnsId;

    /**
     * 商品ID
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 数量
     */
    private Integer quantity;

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
     * 获取退货单ID
     *
     * @return returns_id - 退货单ID
     */
    public Long getReturnsId() {
        return returnsId;
    }

    /**
     * 设置退货单ID
     *
     * @param returnsId 退货单ID
     */
    public void setReturnsId(Long returnsId) {
        this.returnsId = returnsId;
    }

    /**
     * 获取商品ID
     *
     * @return item_id - 商品ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品ID
     *
     * @param itemId 商品ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
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