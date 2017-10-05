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
public class ParkingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creation of the Plaza Parking
        Plaza plaza = new Plaza(3);
        plaza.createLevel(0, 25, 5, 5, 2);
        plaza.createLevel(1, 20, 2, 2, 1);
        plaza.createLevel(2, 40, 5, 10, 1);
        
        // Creation of some Vehicles
        Moto m1 = new Moto("ASD123");
        Moto m2 = new Moto("TER321");
        Car c1 = new Car("PRC159");
        Car c2 = new Car("MNB555");
        Bus b1 = new Bus("LFD456");
        
        // read from a file car1,4x4,E 
        // bus,van,E
        // car1,4x4,L
        
        // Parking Vehicles
        plaza.park(c2);
        plaza.park(c2);
        plaza.park(c2);
        //Un-parking Vehicles
        plaza.unPark(c2);
        
    }
    
}
