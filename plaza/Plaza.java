/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaza;

import java.util.*;

/**
 *
 * @author Lucas
 */
public class Plaza {
    private HashMap<Integer,Level> mapLevels = new HashMap<>();
    private int floors = 0;
    private Vehicle vehicle;
    public HashMap<String,Vehicle> mapVehicles = new HashMap<>();
    private int spaceAvailable = 0;
    
    public Plaza(int f){
        this.floors = f;
    }
    
    public void createLevel(int spaces, int disabled, int electric, int exits, int floor){
        Level level = new Level(spaces, disabled, electric, exits, floor);
        this.mapLevels.put(floor,level);
        this.floors += 1;
        this.spaceAvailable += spaces;
    }
    
    public void park(Vehicle v){
        if (v.isParked()){
            System.out.println("The Vehicle "+v.domain+" is already parked!");
        }else{
            if(this.spaceAvailable>=v.getNumber_places()){
                v.parked = true;
                mapVehicles.put(v.domain,v);
                this.spaceAvailable-=v.getNumber_places();
                System.out.println("The Vehicle "+v.domain+" is parked.");
            }else{
                System.out.println("There is no more place!");
            }
        }
    }
    
    public void unPark(String domain){
        Vehicle v = this.mapVehicles.get(domain);
        mapVehicles.remove(domain);
        this.spaceAvailable+=v.getNumber_places();
        System.out.println("The Vehicle "+v.domain+" is un-parked.");
    }
    
    public Vehicle vehicleFromDomain(String domain){
        return this.mapVehicles.get(domain);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getSpaceAvailable() {
        return spaceAvailable;
    }

    public void setSpaceAvailable(int spaceAvailable) {
        this.spaceAvailable = spaceAvailable;
    }

    
}
