package com.example.mymall;

public class CartItemModel {

    public static final int CART_ITEM =0;
    public static final int TOTAL_AMOUNT =1;

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /////////cart item
    private int productImage;
    private String productTitle;
    private int freeCoupen;
    private String productprice;
    private String cuttedPrice;
    private int productQuantity;
    private int offerApplied;
    private int coupenApplied;

    public CartItemModel(int type, int productImage, String productTitle, int freeCoupen, String productprice, String cuttedPrice, int productQuantity, int offerApplied, int coupenApplied) {
        this.type = type;
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.freeCoupen = freeCoupen;
        this.productprice = productprice;
        this.cuttedPrice = cuttedPrice;
        this.productQuantity = productQuantity;
        this.offerApplied = offerApplied;
        this.coupenApplied = coupenApplied;
    }

    public int getProductImage() {
        return productImage;
    }
    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
    public String getProductTitle() {
        return productTitle;
    }
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }
    public int getFreeCoupen() {
        return freeCoupen;
    }
    public void setFreeCoupen(int freeCoupen) {
        this.freeCoupen = freeCoupen;
    }
    public String getProductprice() {
        return productprice;
    }
    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }
    public String getCuttedPrice() {
        return cuttedPrice;
    }
    public void setCuttedPrice(String cuttedPrice) {
        this.cuttedPrice = cuttedPrice;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public int getOfferApplied() {
        return offerApplied;
    }
    public void setOfferApplied(int offerApplied) {
        this.offerApplied = offerApplied;
    }
    public int getCoupenApplied() {
        return coupenApplied;
    }
    public void setCoupenApplied(int coupenApplied) {
        this.coupenApplied = coupenApplied;
    }

    /////////cart item

    /////////cart total
    private String totalItems;
    private String totalItemPrice;
    private String deliveryPrice;
    private String savedAmount;
    private String totalAmount;

    public CartItemModel(int type, String totalItems, String totalItemPrice, String deliveryPrice,String totalAmount, String savedAmount) {
        this.totalAmount=totalAmount;
        this.type = type;
        this.totalItems = totalItems;
        this.totalItemPrice = totalItemPrice;
        this.deliveryPrice = deliveryPrice;
        this.savedAmount = savedAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public String getTotalItemPrice() {
        return totalItemPrice;
    }

    public void setTotalItemPrice(String totalItemPrice) {
        this.totalItemPrice = totalItemPrice;
    }

    public String getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(String deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getSavedAmount() {
        return savedAmount;
    }

    public void setSavedAmount(String savedAmount) {
        this.savedAmount = savedAmount;
    }
/////////cart total
}
