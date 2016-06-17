package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 产品序列号
     */
    @Column(name = "product_sn")
    private String productSn;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品全名
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 库存备注
     */
    @Column(name = "stock_memo")
    private String stockMemo;

    /**
     * 已分配库存 
     */
    @Column(name = "allocated_stock")
    private Integer allocatedStock;

    /**
     * 成本价
     */
    private BigDecimal cost;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 市场价格
     */
    @Column(name = "market_price")
    private BigDecimal marketPrice;

    /**
     * 积分
     */
    private Long point;

    /**
     * 销量
     */
    private Long sales;

    /**
     * 点击量
     */
    private Long hits;

    /**
     * 展示图片
     */
    private String image;

    /**
     * 单位
     */
    private String unit;

    /**
     * 重量
     */
    private Integer weight;

    /**
     * 是否为赠品
     */
    @Column(name = "is_gift")
    private Boolean isGift;

    /**
     * 是否列出
     */
    @Column(name = "is_list")
    private Boolean isList;

    /**
     * 是否上架
     */
    @Column(name = "is_marketable")
    private Boolean isMarketable;

    /**
     * 是否置顶 
     */
    @Column(name = "is_top")
    private Boolean isTop;

    /**
     * 搜索关键词
     */
    private String keyword;

    /**
     * 备注
     */
    private String memo;

    /**
     * 评分
     */
    private Float score;

    /**
     * 评分数
     */
    @Column(name = "score_count")
    private Long scoreCount;

    /**
     * 总评分
     */
    @Column(name = "total_score")
    private Long totalScore;

    /**
     * 页面描述
     */
    @Column(name = "seo_description")
    private String seoDescription;

    /**
     * 页面关键词
     */
    @Column(name = "seo_keywords")
    private String seoKeywords;

    /**
     * 页面标题
     */
    @Column(name = "seo_title")
    private String seoTitle;

    /**
     * 月点击
     */
    @Column(name = "month_hits")
    private Long monthHits;

    /**
     * 月点击更新时间
     */
    @Column(name = "month_hits_date")
    private Date monthHitsDate;

    /**
     * 月销量
     */
    @Column(name = "month_sales")
    private Long monthSales;

    /**
     * 月销量更新时间
     */
    @Column(name = "month_sales_date")
    private Date monthSalesDate;

    /**
     * 周点击
     */
    @Column(name = "week_hits")
    private Long weekHits;

    /**
     * 周点击日期
     */
    @Column(name = "week_hits_date")
    private Date weekHitsDate;

    /**
     * 周销量
     */
    @Column(name = "week_sales")
    private Long weekSales;

    /**
     * 周销量更新日期
     */
    @Column(name = "week_sales_date")
    private Date weekSalesDate;

    /**
     * 品牌ID
     */
    private Long brand;

    /**
     * 商品ID
     */
    private Long goods;

    /**
     * 分类ID
     */
    @Column(name = "product_category")
    private Long productCategory;

    /**
     * 商家ID
     */
    private Long partner;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 简介
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
     * 获取产品序列号
     *
     * @return product_sn - 产品序列号
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 设置产品序列号
     *
     * @param productSn 产品序列号
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * 获取产品名称
     *
     * @return name - 产品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置产品名称
     *
     * @param name 产品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取产品全名
     *
     * @return full_name - 产品全名
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置产品全名
     *
     * @param fullName 产品全名
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取库存备注
     *
     * @return stock_memo - 库存备注
     */
    public String getStockMemo() {
        return stockMemo;
    }

    /**
     * 设置库存备注
     *
     * @param stockMemo 库存备注
     */
    public void setStockMemo(String stockMemo) {
        this.stockMemo = stockMemo == null ? null : stockMemo.trim();
    }

    /**
     * 获取已分配库存 
     *
     * @return allocated_stock - 已分配库存 
     */
    public Integer getAllocatedStock() {
        return allocatedStock;
    }

    /**
     * 设置已分配库存 
     *
     * @param allocatedStock 已分配库存 
     */
    public void setAllocatedStock(Integer allocatedStock) {
        this.allocatedStock = allocatedStock;
    }

    /**
     * 获取成本价
     *
     * @return cost - 成本价
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 设置成本价
     *
     * @param cost 成本价
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
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
     * 获取市场价格
     *
     * @return market_price - 市场价格
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * 设置市场价格
     *
     * @param marketPrice 市场价格
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 获取积分
     *
     * @return point - 积分
     */
    public Long getPoint() {
        return point;
    }

    /**
     * 设置积分
     *
     * @param point 积分
     */
    public void setPoint(Long point) {
        this.point = point;
    }

    /**
     * 获取销量
     *
     * @return sales - 销量
     */
    public Long getSales() {
        return sales;
    }

    /**
     * 设置销量
     *
     * @param sales 销量
     */
    public void setSales(Long sales) {
        this.sales = sales;
    }

    /**
     * 获取点击量
     *
     * @return hits - 点击量
     */
    public Long getHits() {
        return hits;
    }

    /**
     * 设置点击量
     *
     * @param hits 点击量
     */
    public void setHits(Long hits) {
        this.hits = hits;
    }

    /**
     * 获取展示图片
     *
     * @return image - 展示图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置展示图片
     *
     * @param image 展示图片
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 获取单位
     *
     * @return unit - 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位
     *
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
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
     * 获取是否为赠品
     *
     * @return is_gift - 是否为赠品
     */
    public Boolean getIsGift() {
        return isGift;
    }

    /**
     * 设置是否为赠品
     *
     * @param isGift 是否为赠品
     */
    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    /**
     * 获取是否列出
     *
     * @return is_list - 是否列出
     */
    public Boolean getIsList() {
        return isList;
    }

    /**
     * 设置是否列出
     *
     * @param isList 是否列出
     */
    public void setIsList(Boolean isList) {
        this.isList = isList;
    }

    /**
     * 获取是否上架
     *
     * @return is_marketable - 是否上架
     */
    public Boolean getIsMarketable() {
        return isMarketable;
    }

    /**
     * 设置是否上架
     *
     * @param isMarketable 是否上架
     */
    public void setIsMarketable(Boolean isMarketable) {
        this.isMarketable = isMarketable;
    }

    /**
     * 获取是否置顶 
     *
     * @return is_top - 是否置顶 
     */
    public Boolean getIsTop() {
        return isTop;
    }

    /**
     * 设置是否置顶 
     *
     * @param isTop 是否置顶 
     */
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    /**
     * 获取搜索关键词
     *
     * @return keyword - 搜索关键词
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置搜索关键词
     *
     * @param keyword 搜索关键词
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 获取评分
     *
     * @return score - 评分
     */
    public Float getScore() {
        return score;
    }

    /**
     * 设置评分
     *
     * @param score 评分
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * 获取评分数
     *
     * @return score_count - 评分数
     */
    public Long getScoreCount() {
        return scoreCount;
    }

    /**
     * 设置评分数
     *
     * @param scoreCount 评分数
     */
    public void setScoreCount(Long scoreCount) {
        this.scoreCount = scoreCount;
    }

    /**
     * 获取总评分
     *
     * @return total_score - 总评分
     */
    public Long getTotalScore() {
        return totalScore;
    }

    /**
     * 设置总评分
     *
     * @param totalScore 总评分
     */
    public void setTotalScore(Long totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * 获取页面描述
     *
     * @return seo_description - 页面描述
     */
    public String getSeoDescription() {
        return seoDescription;
    }

    /**
     * 设置页面描述
     *
     * @param seoDescription 页面描述
     */
    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }

    /**
     * 获取页面关键词
     *
     * @return seo_keywords - 页面关键词
     */
    public String getSeoKeywords() {
        return seoKeywords;
    }

    /**
     * 设置页面关键词
     *
     * @param seoKeywords 页面关键词
     */
    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    /**
     * 获取页面标题
     *
     * @return seo_title - 页面标题
     */
    public String getSeoTitle() {
        return seoTitle;
    }

    /**
     * 设置页面标题
     *
     * @param seoTitle 页面标题
     */
    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    /**
     * 获取月点击
     *
     * @return month_hits - 月点击
     */
    public Long getMonthHits() {
        return monthHits;
    }

    /**
     * 设置月点击
     *
     * @param monthHits 月点击
     */
    public void setMonthHits(Long monthHits) {
        this.monthHits = monthHits;
    }

    /**
     * 获取月点击更新时间
     *
     * @return month_hits_date - 月点击更新时间
     */
    public Date getMonthHitsDate() {
        return monthHitsDate;
    }

    /**
     * 设置月点击更新时间
     *
     * @param monthHitsDate 月点击更新时间
     */
    public void setMonthHitsDate(Date monthHitsDate) {
        this.monthHitsDate = monthHitsDate;
    }

    /**
     * 获取月销量
     *
     * @return month_sales - 月销量
     */
    public Long getMonthSales() {
        return monthSales;
    }

    /**
     * 设置月销量
     *
     * @param monthSales 月销量
     */
    public void setMonthSales(Long monthSales) {
        this.monthSales = monthSales;
    }

    /**
     * 获取月销量更新时间
     *
     * @return month_sales_date - 月销量更新时间
     */
    public Date getMonthSalesDate() {
        return monthSalesDate;
    }

    /**
     * 设置月销量更新时间
     *
     * @param monthSalesDate 月销量更新时间
     */
    public void setMonthSalesDate(Date monthSalesDate) {
        this.monthSalesDate = monthSalesDate;
    }

    /**
     * 获取周点击
     *
     * @return week_hits - 周点击
     */
    public Long getWeekHits() {
        return weekHits;
    }

    /**
     * 设置周点击
     *
     * @param weekHits 周点击
     */
    public void setWeekHits(Long weekHits) {
        this.weekHits = weekHits;
    }

    /**
     * 获取周点击日期
     *
     * @return week_hits_date - 周点击日期
     */
    public Date getWeekHitsDate() {
        return weekHitsDate;
    }

    /**
     * 设置周点击日期
     *
     * @param weekHitsDate 周点击日期
     */
    public void setWeekHitsDate(Date weekHitsDate) {
        this.weekHitsDate = weekHitsDate;
    }

    /**
     * 获取周销量
     *
     * @return week_sales - 周销量
     */
    public Long getWeekSales() {
        return weekSales;
    }

    /**
     * 设置周销量
     *
     * @param weekSales 周销量
     */
    public void setWeekSales(Long weekSales) {
        this.weekSales = weekSales;
    }

    /**
     * 获取周销量更新日期
     *
     * @return week_sales_date - 周销量更新日期
     */
    public Date getWeekSalesDate() {
        return weekSalesDate;
    }

    /**
     * 设置周销量更新日期
     *
     * @param weekSalesDate 周销量更新日期
     */
    public void setWeekSalesDate(Date weekSalesDate) {
        this.weekSalesDate = weekSalesDate;
    }

    /**
     * 获取品牌ID
     *
     * @return brand - 品牌ID
     */
    public Long getBrand() {
        return brand;
    }

    /**
     * 设置品牌ID
     *
     * @param brand 品牌ID
     */
    public void setBrand(Long brand) {
        this.brand = brand;
    }

    /**
     * 获取商品ID
     *
     * @return goods - 商品ID
     */
    public Long getGoods() {
        return goods;
    }

    /**
     * 设置商品ID
     *
     * @param goods 商品ID
     */
    public void setGoods(Long goods) {
        this.goods = goods;
    }

    /**
     * 获取分类ID
     *
     * @return product_category - 分类ID
     */
    public Long getProductCategory() {
        return productCategory;
    }

    /**
     * 设置分类ID
     *
     * @param productCategory 分类ID
     */
    public void setProductCategory(Long productCategory) {
        this.productCategory = productCategory;
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
     * 获取简介
     *
     * @return introduction - 简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置简介
     *
     * @param introduction 简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}