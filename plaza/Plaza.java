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
    private int floor;
    private int number;
    private Vehicle vehicle;
    public HashMap<String,Vehicle> map = new HashMap<>();
    private int spaceAvailable;
    
    public Plaza(int s){
        this.spaceAvailable = s;
    }
    
    public void park(int f, int n, Vehicle v){
        if(this.spaceAvailable!=0){
            v.parked = true;
            map.put(String.valueOf(f)+String.valueOf(n),this.vehicle);
            this.spaceAvailable--;
            System.out.println("The car "+v.domain+" is parked.");
        }else{
            System.out.println("There is no more place!");
        }
    }
    
    public void unPark(Vehicle v){
        v.parked = false;
        map.remove(v);
        this.spaceAvailable++;
        System.out.println("The car "+v.domain+" is un-parked.");
    }
    
}
