package org.example.entity;

import org.example.enums.RealEstateEnum;
import org.example.enums.SaleTypeEnum;

public class SummerHouse extends RealEstate{
    public SummerHouse() {
        super();
        this.setRealEstateEnum(RealEstateEnum.SUMMER_HOUSE);

    }

    public SummerHouse(String address, int room, int livingRoom, double price, double area, SaleTypeEnum saleTypeEnum) {
        super(address, room, livingRoom, price, area, saleTypeEnum);
        this.setRealEstateEnum(RealEstateEnum.SUMMER_HOUSE);

    }
}
