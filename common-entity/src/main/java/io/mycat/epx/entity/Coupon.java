package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 使用起始日期
     */
    @Column(name = "begin_date")
    private Date beginDate;

    /**
     * 使用结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 是否允许积分兑换
     */
    @Column(name = "is_exchange")
    private Boolean isExchange;

    /**
     * 最大商品价格
     */
    @Column(name = "maximum_price")
    private BigDecimal maximumPrice;

    /**
     * 最大商品数量
     */
    @Column(name = "maximum_quantity")
    private Integer maximumQuantity;

    /**
     * 最小商品价格
     */
    @Column(name = "minimum_price")
    private BigDecimal minimumPrice;

    /**
     * 最小商品数量
     */
    @Column(name = "minimum_quantity")
    private Integer minimumQuantity;

    /**
     * 名称
     */
    private String name;

    /**
     * 积分兑换数
     */
    private Long point;

    /**
     * 前缀
     */
    private String prefix;

    /**
     * 价格运算表达式
     */
    @Column(name = "price_expression")
    private String priceExpression;

    /**
     * 商家ID
     */
    private Long partner;

    /**
     * 介绍
     */
    private String introduction;

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
     * 获取使用起始日期
     *
     * @return begin_date - 使用起始日期
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置使用起始日期
     *
     * @param beginDate 使用起始日期
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取使用结束日期
     *
     * @return end_date - 使用结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置使用结束日期
     *
     * @param endDate 使用结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取是否启用
     *
     * @return is_enabled - 是否启用
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用
     *
     * @param isEnabled 是否启用
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取是否允许积分兑换
     *
     * @return is_exchange - 是否允许积分兑换
     */
    public Boolean getIsExchange() {
        return isExchange;
    }

    /**
     * 设置是否允许积分兑换
     *
     * @param isExchange 是否允许积分兑换
     */
    public void setIsExchange(Boolean isExchange) {
        this.isExchange = isExchange;
    }

    /**
     * 获取最大商品价格
     *
     * @return maximum_price - 最大商品价格
     */
    public BigDecimal getMaximumPrice() {
        return maximumPrice;
    }

    /**
     * 设置最大商品价格
     *
     * @param maximumPrice 最大商品价格
     */
    public void setMaximumPrice(BigDecimal maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    /**
     * 获取最大商品数量
     *
     * @return maximum_quantity - 最大商品数量
     */
    public Integer getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * 设置最大商品数量
     *
     * @param maximumQuantity 最大商品数量
     */
    public void setMaximumQuantity(Integer maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    /**
     * 获取最小商品价格
     *
     * @return minimum_price - 最小商品价格
     */
    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * 设置最小商品价格
     *
     * @param minimumPrice 最小商品价格
     */
    public void setMinimumPrice(BigDecimal minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    /**
     * 获取最小商品数量
     *
     * @return minimum_quantity - 最小商品数量
     */
    public Integer getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * 设置最小商品数量
     *
     * @param minimumQuantity 最小商品数量
     */
    public void setMinimumQuantity(Integer minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
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
     * 获取积分兑换数
     *
     * @return point - 积分兑换数
     */
    public Long getPoint() {
        return point;
    }

    /**
     * 设置积分兑换数
     *
     * @param point 积分兑换数
     */
    public void setPoint(Long point) {
        this.point = point;
    }

    /**
     * 获取前缀
     *
     * @return prefix - 前缀
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * 设置前缀
     *
     * @param prefix 前缀
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    /**
     * 获取价格运算表达式
     *
     * @return price_expression - 价格运算表达式
     */
    public String getPriceExpression() {
        return priceExpression;
    }

    /**
     * 设置价格运算表达式
     *
     * @param priceExpression 价格运算表达式
     */
    public void setPriceExpression(String priceExpression) {
        this.priceExpression = priceExpression == null ? null : priceExpression.trim();
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
     * 获取介绍
     *
     * @return introduction - 介绍
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置介绍
     *
     * @param introduction 介绍
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}