package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     *  排序
     */
    private Integer orders;

    /**
     * 图标
     */
    private String icon;

    /**
     * 备注
     */
    private String memo;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型 1 商品 2 其他
     */
    private Integer type;

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
     * 获取 排序
     *
     * @return orders -  排序
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置 排序
     *
     * @param orders  排序
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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
     * 获取类型 1 商品 2 其他
     *
     * @return type - 类型 1 商品 2 其他
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型 1 商品 2 其他
     *
     * @param type 类型 1 商品 2 其他
     */
    public void setType(Integer type) {
        this.type = type;
    }
}