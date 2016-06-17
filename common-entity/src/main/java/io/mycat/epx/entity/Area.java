package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 区域名
     */
    private String name;

    /**
     * 排序
     */
    private Integer orders;

    /**
     * 层级
     */
    @Column(name = "tree_path")
    private String treePath;

    /**
     * 上级ID
     */
    private Long parent;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 区域全名
     */
    @Column(name = "full_name")
    private String fullName;

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
     * 获取区域名
     *
     * @return name - 区域名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置区域名
     *
     * @param name 区域名
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
     * @return tree_path - 层级
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * 设置层级
     *
     * @param treePath 层级
     */
    public void setTreePath(String treePath) {
        this.treePath = treePath == null ? null : treePath.trim();
    }

    /**
     * 获取上级ID
     *
     * @return parent - 上级ID
     */
    public Long getParent() {
        return parent;
    }

    /**
     * 设置上级ID
     *
     * @param parent 上级ID
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

    /**
     * 获取区域全名
     *
     * @return full_name - 区域全名
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置区域全名
     *
     * @param fullName 区域全名
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }
}