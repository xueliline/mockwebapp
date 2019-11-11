package com.imooc.dto;

import com.imooc.entity.Shop;
import com.imooc.enums.ShopStateEnum;

import java.util.List;

public class ShopExcution {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }

    private String stateInfo;
    private int count;
    private Shop shop;
    private List<Shop> shopList;
    public ShopExcution(ShopStateEnum stateenum){
        this.state=stateenum.getState();
        this.stateInfo=stateenum.getStateInfo();

    }
    // 成功的构造器
    public ShopExcution(ShopStateEnum stateEnum, Shop shop) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shop = shop;
    }

    // 成功的构造器
    public ShopExcution(ShopStateEnum stateEnum, List<Shop> shopList) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shopList = shopList;
    }
}
