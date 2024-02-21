package org.example.service;

import org.example.entity.RealEstate;
import org.example.enums.RealEstateEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RealEstateServiceImpl implements RealEstateService {
    private final List<RealEstate> realEstates = new ArrayList<>();

    @Override
    public void addRealEstate(RealEstate realEstate) {
        realEstates.add(realEstate);
    }

    @Override
    public double totalPriceByRealEstateType(RealEstateEnum realEstateType) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getRealEstateEnum() == realEstateType)
                .mapToDouble(RealEstate::getPrice)
                .sum();
    }

    @Override
    public double totalPriceOfAllRealEstates() {
        return realEstates.stream()
                .mapToDouble(RealEstate::getPrice)
                .sum();
    }

    @Override
    public double averageAreaByRealEstateType(RealEstateEnum realEstateType) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getRealEstateEnum() == realEstateType)
                .mapToDouble(RealEstate::getArea)
                .average()
                .orElse(0);
    }

    @Override
    public double averageAreaOfAllRealEstates() {
        return realEstates.stream()
                .mapToDouble(RealEstate::getArea)
                .average()
                .orElse(0);
    }

    @Override
    public List<RealEstate> filterRealEstatesByRoomAndLivingRoom(int room, int livingRoom) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getRoom() == room)
                .filter(realEstate -> realEstate.getLivingRoom() == livingRoom)
                .collect(Collectors.toList());
    }
}
