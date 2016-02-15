package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String desc;

    @Column(name = "categoryId")
    private Long categoryid;

    /**
     * 商家ID
     */
    private Long partner;

    /**
     * 0 :正常 1: DELETE
     */
    private Byte status;

    private Long operator;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * @return categoryId
     */
    public Long getCategoryid() {
        return categoryid;
    }

    /**
     * @param categoryid
     */
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 获取商家ID
     *
     * @return partner - 商家ID
     */
    public Long getPartner() {
        return partner;
    }

    /**
     * 设置商家ID
     *
     * @param partner 商家ID
     */
    public void setPartner(Long partner) {
        this.partner = partner;
    }

    /**
     * 获取0 :正常 1: DELETE
     *
     * @return status - 0 :正常 1: DELETE
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0 :正常 1: DELETE
     *
     * @param status 0 :正常 1: DELETE
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return operator
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(Long operator) {
        this.operator = operator;
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