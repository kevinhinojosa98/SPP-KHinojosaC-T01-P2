/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.khinojosac.t01.pkg2;
import java.util.Scanner;

/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCT012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de perímetro y superficie de un rectángulo");
        
        //Variables. 
        double base, altu;
        double per, sup;
        
            
        System.out.println("Introduce la base ");
        base = teclado.nextDouble();
        System.out.println("Introduce la altura ");
        altu = teclado.nextDouble();
        //
        //Operaciones Lógicas.
        per = (base * altu);
        sup = (base * altu)/2;
        
        System.out.println("Perimetro: " + per);
      
        System.out.println("Superficie: " + sup);
        
        
   
        // TODO code application logic here
    }
    
}
