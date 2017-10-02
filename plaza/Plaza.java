/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaza;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Plaza {
    private int floor;
    private int number;
    private Vehicle vehicle;
    public ArrayList<Vehicle> list = new ArrayList<>();
    private int spaceAvailable = 30;
    
    public Plaza(int f, int n, Vehicle v){
        this.floor = f;
        this.number = n;
        this.vehicle = v;
    }
    
    public void park(){
        if(this.spaceAvailable!=0){
            this.vehicle.parked = true;
            list.add(this.vehicle);
            this.spaceAvailable--;
            System.out.println("The car "+this.vehicle.domain+" is parked.");
        }else{
            System.out.println("There is no more place!");
        }
    }
    
    public void unPark(){
        this.vehicle.parked = false;
        list.remove(this.vehicle);
        this.spaceAvailable++;
        System.out.println("The car "+this.vehicle.domain+"is un-parked.");
    }
    
}
