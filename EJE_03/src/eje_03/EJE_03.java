/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje_03;

import java.util.TreeSet;
import java.util.Scanner;
/**
 *
 * @author Sans
 */
public class EJE_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet <String> lista=new TreeSet();
        Scanner teclado=new Scanner(System.in);
        int n;
        System.out.println("Ingrese la cantidad de cadenas a ingresar");
        n=teclado.nextInt();
        String c=teclado.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Ingrese cadena");
            String m=teclado.nextLine();
            lista.add(m);
        }
        for(String i:lista){
            System.out.println(i);
        }
        //el hecho de que lo ordena se debe a la naturaleza del treeset que a medida que se ingresan dato/objetos este los ordena
    }
    
}
