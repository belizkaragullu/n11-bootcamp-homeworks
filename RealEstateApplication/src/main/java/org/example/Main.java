package org.example;

import org.example.entity.House;
import org.example.entity.SummerHouse;
import org.example.entity.Villa;
import org.example.enums.RealEstateEnum;
import org.example.enums.SaleTypeEnum;
import org.example.service.RealEstateServiceImpl;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        RealEstateServiceImpl realEstateService = new RealEstateServiceImpl();
        realEstateService.addRealEstate(new House("Istanbul", 2, 1, 80000, 200, SaleTypeEnum.SALE));
        realEstateService.addRealEstate(new House("Izmİr", 2, 2, 50000, 150, SaleTypeEnum.SALE));
        realEstateService.addRealEstate(new House("Hatay", 4, 1, 60000, 250, SaleTypeEnum.SALE));
        realEstateService.addRealEstate(new House("Trabzon", 3, 1, 70000, 180, SaleTypeEnum.SALE));

        realEstateService.addRealEstate(new Villa("Gaziantep", 4, 1, 80000, 200, SaleTypeEnum.SALE));
        realEstateService.addRealEstate(new Villa("Bursa", 2, 2, 4000, 130, SaleTypeEnum.RENT));
        realEstateService.addRealEstate(new Villa("Eskisehir", 3, 1, 50000, 160, SaleTypeEnum.SALE));
        realEstateService.addRealEstate(new Villa("Kars", 5, 1, 90000, 240, SaleTypeEnum.SALE));

        realEstateService.addRealEstate(new SummerHouse("Edirne", 3, 1, 6000, 150, SaleTypeEnum.RENT));
        realEstateService.addRealEstate(new SummerHouse("Afyon", 1, 1, 20000, 120, SaleTypeEnum.SALE));
        realEstateService.addRealEstate(new SummerHouse("Antalya", 4, 2, 95000, 230, SaleTypeEnum.SALE));
        realEstateService.addRealEstate(new SummerHouse("Ankara", 3, 2, 70000, 200, SaleTypeEnum.SALE));

        System.out.println("\n");
        System.out.println("Total price of houses " + realEstateService.totalPriceByRealEstateType(RealEstateEnum.HOUSE));
        System.out.println("Total price of villas " + realEstateService.totalPriceByRealEstateType(RealEstateEnum.VILLA));
        System.out.println("Total price of summer houses " + realEstateService.totalPriceByRealEstateType(RealEstateEnum.SUMMER_HOUSE));
        System.out.println("Total price of all real estates " + realEstateService.totalPriceOfAllRealEstates());

        System.out.println("\n");
        System.out.println("Average area of houses " + realEstateService.averageAreaByRealEstateType(RealEstateEnum.HOUSE));
        System.out.println("Average area of villas " + realEstateService.averageAreaByRealEstateType(RealEstateEnum.VILLA));
        System.out.println("Average area of summer houses " + realEstateService.averageAreaByRealEstateType(RealEstateEnum.SUMMER_HOUSE));
        System.out.println("Average area of all real estates " + realEstateService.averageAreaOfAllRealEstates());

        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of rooms ");
        int room = scanner.nextInt();
        System.out.print("Please enter number of living rooms ");
        int livingRoom = scanner.nextInt();

        System.out.println("Filtered real estates with " + room + " room and " + livingRoom + " living room are "
                + realEstateService.filterRealEstatesByRoomAndLivingRoom(room, livingRoom));
    }
}