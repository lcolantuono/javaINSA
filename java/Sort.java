/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

/**
 *
 * @author Lucas
 */
public class Sort {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] random = {3,4,12,9,8,6,12,11,2,6,50,-4,1,10,11};
        int[] sorted = sortArray(random);
        for (int i=0;i<sorted.length;i++){
            System.out.println(sorted[i]+" ");
        }
    }
    
    public static int[] sortArray(int[] array){
        int aux;

        for (int i=0;i<array.length;i++){
            for (int e=i+1;e<array.length;e++){
                if (array[e]<array[i]){
                    aux = array[i];
                    array[i] = array[e];
                    array[e] = aux;
                }
            }
        }
        return array;
    }
    
}
