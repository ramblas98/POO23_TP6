/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpnº6_ej3;

import java.util.*;


public class TPNº6_EJ3 {

    
    public static void main(String[] args) {
     //instanciar TreeSet de cadenas   
     TreeSet<String> lista = new TreeSet<>(); 
     
     //agregar cadenas a la lista
     lista.add("Jonatan");
     lista.add("Alexis");
     lista.add("Cossio");
     lista.add("Carrizo");
     
     //recorrer el conjunto y mostrarlos 
     for (String cadena : lista){
         System.out.println(cadena);
     }
        
    }
    
}
