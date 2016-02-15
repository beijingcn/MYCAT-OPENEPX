package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_cart_item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cartId")
    private Long cartid;

    @Column(name = "itemId")
    private Long itemid;

    private Integer quantity;

    @Column(name = "createDate")
    private Date createdate;

    @Column(name = "modifyDate")
    private Date modifydate;

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
     * @return cartId
     */
    public Long getCartid() {
        return cartid;
    }

    /**
     * @param cartid
     */
    public void setCartid(Long cartid) {
        this.cartid = cartid;
    }

    /**
     * @return itemId
     */
    public Long getItemid() {
        return itemid;
    }

    /**
     * @param itemid
     */
    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return createDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return modifyDate
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * @param modifydate
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}