package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 商品ID
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * 商家ID
     */
    private Long partner;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 是否显示
     */
    @Column(name = "is_show")
    private Boolean isShow;

    /**
     * 评分 1-5
     */
    private Integer score;

    /**
     * 等级 0 好评 1 中评 3 差评
     */
    private Integer level;

    /**
     * 用户IP
     */
    private String ip;

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
     * @return parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取商品ID
     *
     * @return item_id - 商品ID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 设置商品ID
     *
     * @param itemId 商品ID
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
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
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取是否显示
     *
     * @return is_show - 是否显示
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * 设置是否显示
     *
     * @param isShow 是否显示
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取评分 1-5
     *
     * @return score - 评分 1-5
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置评分 1-5
     *
     * @param score 评分 1-5
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取等级 0 好评 1 中评 3 差评
     *
     * @return level - 等级 0 好评 1 中评 3 差评
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置等级 0 好评 1 中评 3 差评
     *
     * @param level 等级 0 好评 1 中评 3 差评
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取用户IP
     *
     * @return ip - 用户IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置用户IP
     *
     * @param ip 用户IP
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
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