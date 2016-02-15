package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称 
     */
    private String name;

    /**
     * 是否内置
     */
    @Column(name = "is_system")
    private Boolean isSystem;

    /**
     * 描述
     */
    private String description;

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
     * 获取是否内置
     *
     * @return is_system - 是否内置
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * 设置是否内置
     *
     * @param isSystem 是否内置
     */
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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