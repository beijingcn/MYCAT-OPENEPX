package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_member_rank")
public class MemberRank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 优惠比例
     */
    private Double scale;

    /**
     * 消费金额
     */
    private BigDecimal amount;

    /**
     * 是否默认
     */
    @Column(name = "is_default")
    private Boolean isDefault;

    /**
     * 是否特殊
     */
    @Column(name = "is_special")
    private Boolean isSpecial;

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
     * 获取优惠比例
     *
     * @return scale - 优惠比例
     */
    public Double getScale() {
        return scale;
    }

    /**
     * 设置优惠比例
     *
     * @param scale 优惠比例
     */
    public void setScale(Double scale) {
        this.scale = scale;
    }

    /**
     * 获取消费金额
     *
     * @return amount - 消费金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置消费金额
     *
     * @param amount 消费金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取是否默认
     *
     * @return is_default - 是否默认
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认
     *
     * @param isDefault 是否默认
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取是否特殊
     *
     * @return is_special - 是否特殊
     */
    public Boolean getIsSpecial() {
        return isSpecial;
    }

    /**
     * 设置是否特殊
     *
     * @param isSpecial 是否特殊
     */
    public void setIsSpecial(Boolean isSpecial) {
        this.isSpecial = isSpecial;
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