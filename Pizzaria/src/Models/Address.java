/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gabriel
 */
public class Address {

    private String road;
    private String number;
    private String district;
    private String city;
    private String state;

    private Address() {
        // empty creator
    }

    public static Address Build() {
        return new Address();
    }

    public String getRoad() {
        return road;
    }

    public Address setRoad(String road) {
        this.road = road;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Address setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public Address setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }
    
    public String getAddress(){
        return getRoad() + ", " + getNumber() + " - " + getDistrict();
    }
    
    public String getFullAddress(){
        return getAddress()+"\n"+getCity()+",  "+getState();
    }
    

}
