package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_coupon_code")
public class CouponCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 号码
     */
    private String code;

    /**
     * 是否已使用
     */
    @Column(name = "is_used")
    private Boolean isUsed;

    /**
     * 使用日期
     */
    @Column(name = "used_date")
    private Date usedDate;

    /**
     * 优惠券
     */
    private Long coupon;

    /**
     * 会员
     */
    private Long member;

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
     * 获取号码
     *
     * @return code - 号码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置号码
     *
     * @param code 号码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取是否已使用
     *
     * @return is_used - 是否已使用
     */
    public Boolean getIsUsed() {
        return isUsed;
    }

    /**
     * 设置是否已使用
     *
     * @param isUsed 是否已使用
     */
    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    /**
     * 获取使用日期
     *
     * @return used_date - 使用日期
     */
    public Date getUsedDate() {
        return usedDate;
    }

    /**
     * 设置使用日期
     *
     * @param usedDate 使用日期
     */
    public void setUsedDate(Date usedDate) {
        this.usedDate = usedDate;
    }

    /**
     * 获取优惠券
     *
     * @return coupon - 优惠券
     */
    public Long getCoupon() {
        return coupon;
    }

    /**
     * 设置优惠券
     *
     * @param coupon 优惠券
     */
    public void setCoupon(Long coupon) {
        this.coupon = coupon;
    }

    /**
     * 获取会员
     *
     * @return member - 会员
     */
    public Long getMember() {
        return member;
    }

    /**
     * 设置会员
     *
     * @param member 会员
     */
    public void setMember(Long member) {
        this.member = member;
    }
}