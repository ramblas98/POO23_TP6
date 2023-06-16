/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpnº6_ej4;

import java.util.*;

public class TPNº6_Ej4 {

    
    public static void main(String[] args) {
        //instanciar con Arraylist
        ArrayList<NumeroComplejo> lista = new ArrayList();
        //agreagar
        lista.add(new NumeroComplejo(1,1));
        lista.add(new NumeroComplejo(2,2));
        lista.add(new NumeroComplejo(1,1));
        lista.add(new NumeroComplejo(3,-1));
        lista.add(new NumeroComplejo(2,2));
        
        
        
        Iterator<NumeroComplejo> it = lista.iterator();
        
        while(it.hasNext()){
            NumeroComplejo num = it.next();
            System.out.print(num.toString());
        }
        
        //instanciar con HashSet
        HashSet<NumeroComplejo> lista2 = new HashSet();
        //agregar
        lista2.addAll(lista);
        System.out.println(lista2);
        
        //instanciar con TreeSet
        
        TreeSet<NumeroComplejo> lista3 = new TreeSet();
        //agregar
        lista3.addAll(lista);
        System.out.println(lista3);
        
        
        // Arrays.sort(lista); no se ocupa con colecciones o mapas
      
    }
    
}
