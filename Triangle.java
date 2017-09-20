/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainsa;

/**
 *
 * @author Lucas
 */
public class Triangle {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 2;
        int base = 2*n+1;
        for (int i=0;i<=base;i++){
            for (int e=0;e<i;e++){
                if(i==base && e==base-1){
                    System.out.print("*");
                }else{
                    System.out.print("**");
                }
            }
            System.out.println();
        }
        for (int i=base;i>0;i--){
            for (int e=1;e<i;e++){
                System.out.print("**");   
            }
            System.out.println();
        }
    }
    
}
