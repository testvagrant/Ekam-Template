package ekam.example.api.getAddress.model;

import lombok.Getter;

@Getter
public class DataItem {
    private String zipcode;
    private String country;
    private String streetName;
    private String city;
    private String countyCode;
    private String street;
    private double latitude;
    private String buildingNumber;
    private int id;
    private double longitude;
}