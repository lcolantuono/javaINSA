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
    private final int floors;
    private Vehicle vehicle;
    public ArrayList<Vehicle> mapVehicles = new ArrayList<>();
    private int spaceAvailable = 30;
    
    public Plaza(int f){
        this.floors = f;
    }
    
    public void createLevel(int num_level, int spaces, int disabled, int electric, int exits){
        Level level = new Level(spaces, disabled, electric, exits);
        this.mapLevels.put(num_level,level);
    }
    
    public void park(Vehicle v){
        if (v.isParked()){
            System.out.println("The Vehicle is already parked!");
        }else{
            if(this.spaceAvailable>=v.getNumber_places()){
                v.parked = true;
                mapVehicles.add(this.vehicle);
                this.spaceAvailable-=v.getNumber_places();
                System.out.println("The car "+v.domain+" is parked.");
            }else{
                System.out.println("There is no more place!");
            }
        }
    }
    
    public void unPark(Vehicle v){
        v.parked = false;
        mapVehicles.remove(v);
        this.spaceAvailable+=v.getNumber_places();
        System.out.println("The car "+v.domain+" is un-parked.");
    }
    
}
