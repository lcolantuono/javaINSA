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
public class Car extends Vehicle{
    public Car(String d){
        super();
        this.domain = d;
        this.size = "Medium";
        this.number_places = 2;
    }
    
    public Car(){
        super();
        this.size = "Medium";
    }
}
