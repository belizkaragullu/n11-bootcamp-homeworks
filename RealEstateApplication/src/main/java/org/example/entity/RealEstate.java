package org.example.entity;

import org.example.enums.RealEstateEnum;
import org.example.enums.SaleTypeEnum;

public abstract class RealEstate {
    private String address;
    private int room;
    private int livingRoom;
    private double price;
    private double area;
    private SaleTypeEnum saleTypeEnum;
    private RealEstateEnum realEstateEnum;

    public RealEstate() {
         this.address="";
         this.room=0;
         this.livingRoom=0;
         this.price=0;
         this.area=0;
         this.saleTypeEnum=null;
         this.realEstateEnum=null;
    }

    public RealEstate(String address, int room, int livingRoom, double price, double area, SaleTypeEnum saleTypeEnum) {
        this.address = address;
        this.room = room;
        this.livingRoom = livingRoom;
        this.price = price;
        this.area = area;
        this.saleTypeEnum = saleTypeEnum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public SaleTypeEnum getSaleTypeEnum() {
        return saleTypeEnum;
    }

    public void setSaleTypeEnum(SaleTypeEnum saleTypeEnum) {
        this.saleTypeEnum = saleTypeEnum;
    }

    public RealEstateEnum getRealEstateEnum() {
        return realEstateEnum;
    }

    public void setRealEstateEnum(RealEstateEnum realEstateEnum) {
        this.realEstateEnum = realEstateEnum;
    }

    @Override
    public String toString() {
        return "This is a " + realEstateEnum +
                " in " + address +
                ", has " + room + " room and " + livingRoom + " living room."+
                " Area is " + area +
                ", price is " + price + "." +
                " It is for " + saleTypeEnum;



    }
}
