package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_product_category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称 
     */
    private String name;

    /**
     * 排序
     */
    private Integer orders;

    /**
     * 层级
     */
    private Integer grade;

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
     * 树路径
     */
    @Column(name = "tree_path")
    private String treePath;

    /**
     * 上级分类ID
     */
    private Long parent;

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
     * 获取层级
     *
     * @return grade - 层级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置层级
     *
     * @param grade 层级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
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
     * 获取树路径
     *
     * @return tree_path - 树路径
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * 设置树路径
     *
     * @param treePath 树路径
     */
    public void setTreePath(String treePath) {
        this.treePath = treePath == null ? null : treePath.trim();
    }

    /**
     * 获取上级分类ID
     *
     * @return parent - 上级分类ID
     */
    public Long getParent() {
        return parent;
    }

    /**
     * 设置上级分类ID
     *
     * @param parent 上级分类ID
     */
    public void setParent(Long parent) {
        this.parent = parent;
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