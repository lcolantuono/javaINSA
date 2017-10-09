/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaza;

/**
 *
 * @author Lucas
 */
public class Vehicle {
    String domain;
    String size;
    int number_places;
    boolean parked;
    boolean electric;

    public String getDomain() {
        return domain;
    }

    public String getSize() {
        return size;
    }

    public int getNumber_places() {
        return number_places;
    }

    public boolean isParked() {
        return parked;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumber_places(int number_places) {
        this.number_places = number_places;
    }

    public void setParked(boolean parked) {
        this.parked = parked;
    }
    
    public boolean isElectric() {
        return electric;
    }
    
    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public Vehicle() {
    }
    
}
