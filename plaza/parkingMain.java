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
public class parkingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moto m1 = new Moto("ASD123");
        Moto m2 = new Moto("TER321");
        Car c1 = new Car("PRC159");
        Car c2 = new Car("MNB555");
        Bus b1 = new Bus("LFD456");
        
        Plaza park = new Plaza(30);
        park.park(1,4,c2);
        
        park.unPark(c2);
        
    }
    
}
