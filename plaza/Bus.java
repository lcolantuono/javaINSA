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
public class Bus extends Vehicle{
    public Bus(){
        this.size = "Large";
    }
    public Bus(String domain){
        this.domain = domain;
        this.size = "Large";
    }
}
