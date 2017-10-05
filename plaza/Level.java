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
public class Level{

    private int total_spaces;
    private int electric_spaces;
    private int disabled_spaces;
    private int exits;

    public Level(int total_spaces, int electric_spaces, int disabled_spaces, int exits) {
        this.total_spaces = total_spaces;
        this.electric_spaces = electric_spaces;
        this.disabled_spaces = disabled_spaces;
        this.exits = exits;
    }

    public int getTotal_spaces() {
        return total_spaces;
    }

    public void setTotal_spaces(int total_spaces) {
        this.total_spaces = total_spaces;
    }

    public int getElectric_spaces() {
        return electric_spaces;
    }

    public void setElectric_spaces(int electric_spaces) {
        this.electric_spaces = electric_spaces;
    }

    public int getDisabled_spaces() {
        return disabled_spaces;
    }

    public void setDisabled_spaces(int disabled_spaces) {
        this.disabled_spaces = disabled_spaces;
    }

    public int getExits() {
        return exits;
    }

    public void setExits(int exits) {
        this.exits = exits;
    }
    
    
}
