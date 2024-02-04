/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;
import java.util.Scanner;


public class Tp1 {
        
        public static void main(String[] args) {
        System.out.println("Bonjour , mon premier TP en POO");
        //lecture du nom
        System.out.println("Quelle est votre nom? ");
        Scanner read= new Scanner(System.in);
        String name = read.next();
        
        //lecture d'age 
        System.out.println("Bonjour" + name);
        System.out.println("quel est votre age" + name + "?");
        read= new Scanner (System.in);
        int a;
        a= read.nextInt();
        System.out.println(name + "votre age est " + a);
        
        
    }
        public static double[] calculateProbability (int[][] image){
        int l = image.length;
        int c =image[0].length;
        int nb=0;
        double tab[]=new double [256];
        for (int k =0 ; k<255; k++){
          for (int i =0 ;i<l; i++){
              for (int j=0 ; j< c; j++){ 
                  if (image[i][j]==k) {
                      nb++;
                      
                  }
                  
                  
              }
        
          }
           tab[k]= nb/(l*c);
      
      }
        return tab ;
        
        
    }
        public static double calculateEntropy (int[][] image){
        double h=0;
        double p [] = calculateProbability(image);
         for (int i =0 ; i<255; i++){
             h-= p[i]*(Math.log(p[i])/Math.log(2));
         }
            return h ;
        
        }
}
