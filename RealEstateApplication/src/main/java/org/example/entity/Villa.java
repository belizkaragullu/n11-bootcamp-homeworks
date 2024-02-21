package org.example.entity;

import org.example.enums.RealEstateEnum;
import org.example.enums.SaleTypeEnum;

public class Villa extends RealEstate{
    public Villa() {
        super();
        this.setRealEstateEnum(RealEstateEnum.VILLA);
    }

    public Villa(String address, int room, int livingRoom, double price, double area, SaleTypeEnum saleTypeEnum) {
        super(address, room, livingRoom, price, area, saleTypeEnum);
        this.setRealEstateEnum(RealEstateEnum.VILLA);
    }
}
