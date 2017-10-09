/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaza;

import java.io.*;
import java.util.Arrays;

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
        plaza.createLevel(25, 5, 5, 2, 0);
        plaza.createLevel(20, 2, 2, 1, 1);
        plaza.createLevel(40, 5, 10, 1, 2);
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File ("C:\\Users\\Lucas\\Documents\\NetBeansProjects\\javaINSA\\src\\plaza\\entry.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String line;
            while((line=br.readLine())!=null){
                String[] lineArray = line.split(",");
                if (lineArray.length==3){
                    String domain = lineArray[1];
                    String type = lineArray[0];
                    String action = lineArray[2];
                    if (action.equals("E")){ // Vehicle entry park
                        switch(type){
                            case "Electric": 
                                Electric electric = new Electric(domain);
                                plaza.park(electric);
                                break;
                            case "4x4":
                                Fourbyfour four = new Fourbyfour(domain);
                                plaza.park(four);
                                break;
                            case "Car": 
                                Car car = new Car(domain);
                                plaza.park(car);
                                break;
                            case "Van":
                                Van van = new Van(domain);
                                plaza.park(van);
                                break;
                            case "Tour": 
                                Tour tour = new Tour(domain);
                                plaza.park(tour);
                                break;
                            case "School":
                                School school = new School(domain);
                                plaza.park(school);
                                break;
                            case "Bus":
                                Bus bus = new Bus(domain);
                                plaza.park(bus);
                                break;
                            case "Moto":
                                Moto moto = new Moto(domain);
                                plaza.park(moto);
                                break;
                            default: 
                                System.out.println("It is not possible create the Vehicle type "+type);
                                break;
                        }
                    }else{ // Vehicle leave park
                        //Un-parking Vehicles
                        if (plaza.vehicleFromDomain(domain)!=null){
                            plaza.unPark(domain);
                        }else{
                            System.out.println("The vehicle "+domain+" is not in the Parking.");
                        }

                    }
                }else{
                    System.out.println("Bad format on txt line");
                }
            }
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(plaza.getSpaceAvailable()+" spaces available");
    }
}
