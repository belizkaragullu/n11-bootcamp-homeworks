package org.example.entity;

import org.example.enums.RealEstateEnum;
import org.example.enums.SaleTypeEnum;

public class House extends RealEstate{
    public House() {
        super();
        this.setRealEstateEnum(RealEstateEnum.HOUSE);
    }

    public House(String address, int room, int livingRoom, double price, double area, SaleTypeEnum saleTypeEnum) {
        super(address, room, livingRoom, price, area, saleTypeEnum);
        this.setRealEstateEnum(RealEstateEnum.HOUSE);
    }
}
