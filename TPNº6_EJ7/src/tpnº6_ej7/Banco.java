/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº6_ej7;

import java.util.*;

public class Banco {
    private String nombre;
    private LinkedHashMap<Long,Cuenta> cuentas;
    
    public Banco(){}
    
    public Banco(String nombre){
        this.nombre = nombre;
        this.cuentas = new LinkedHashMap();
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedHashMap<Long, Cuenta> getCuentas() {
        return cuentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuentas(LinkedHashMap<Long, Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    //
    public long abrirCuenta(long dni, double saldo, double interes){
        Cuenta c = new Cuenta(dni, saldo, interes);
        long numeroCuenta = Cuenta.nroc + 1;
        cuentas.put(numeroCuenta, c);
        return numeroCuenta;
    }
    //
    public boolean cerrarCuenta(long numero){
        if (cuentas.)
    }
}
