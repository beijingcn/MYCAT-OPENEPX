package io.mycat.epx.entity;

import javax.persistence.*;

@Table(name = "shop_member_favorite_product")
public class MemberFavoriteProduct {
    @Id
    @Column(name = "favorite_members")
    private Long favoriteMembers;

    @Id
    @Column(name = "favorite_products")
    private Long favoriteProducts;

    /**
     * @return favorite_members
     */
    public Long getFavoriteMembers() {
        return favoriteMembers;
    }

    /**
     * @param favoriteMembers
     */
    public void setFavoriteMembers(Long favoriteMembers) {
        this.favoriteMembers = favoriteMembers;
    }

    /**
     * @return favorite_products
     */
    public Long getFavoriteProducts() {
        return favoriteProducts;
    }

    /**
     * @param favoriteProducts
     */
    public void setFavoriteProducts(Long favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }
}