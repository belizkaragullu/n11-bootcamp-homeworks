package org.example.service;

import org.example.entity.RealEstate;
import org.example.enums.RealEstateEnum;

import java.util.List;

public interface RealEstateService {
    void addRealEstate(RealEstate realEstate);
    double totalPriceByRealEstateType(RealEstateEnum realEstateType);
    double totalPriceOfAllRealEstates();
    double averageAreaByRealEstateType(RealEstateEnum realEstateType);
    double averageAreaOfAllRealEstates();
    List<RealEstate> filterRealEstatesByRoomAndLivingRoom(int room, int livingRoom);
}
