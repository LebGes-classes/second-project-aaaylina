package product;

import java.io.DataInputStream;

public class  Location {
    private String country;
    private String region;
    private String city;
    private String district;
    private String street;
    private int house;
    private int building;
    private String apartment;

    Location(String country, String region, String city, String district,String street, int house, int building, String apartment){
        setCountry(country);
        setRegion(region);
        setCity(city);
        setDistrict(district);
        setStreet(street);
        setHouse(house);
        setBuilding(building);
        setApartment(apartment);
    }

    Location(String country, String region, String city, String district,String street, int house, String apartment){
        setCountry(country);
        setRegion(region);
        setCity(city);
        setDistrict(district);
        setStreet(street);
        setHouse(house);
        setApartment(apartment);
    }


    public Location(String country, String region, String city, String district, String street, int house){
        setCountry(country);
        setRegion(region);
        setCity(city);
        setDistrict(district);
        setStreet(street);
        setHouse(house);
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public int getBuilding() {
        return building;
    }

    public int getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", building=" + building +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
