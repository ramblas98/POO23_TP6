/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Cuenta {
    private long numero;
    private long dni;
    private double interes;
    private double saldo;
    static long nroc = 100000;
    
    public Cuenta(){
    }
    
    public Cuenta(long dni, double interes, double saldo){
        this.numero = nroc++;
        this.dni = dni;
        this.interes = interes;
        this.saldo = saldo;
    }
    //GETTES
    public long getDni(){ return dni; }
    public long getNumero(){ return numero; }
    public double getInteres(){ return interes; }
    public double getSaldo(){ return saldo; }
    //SETTERS
    public void setDni(long dni){ this.dni = dni; }
    public void setNumero(long numero){ this.numero = numero; }
    public void setInteres(double interes){ this.interes = interes; }
    public void setSaldo(double saldo){ this.saldo = saldo; }
    //
    public void actualizarSaldo(){
        this.saldo = (this.interes * 360) / 360;
    }
    //
    public void ingresar(double dato){
        this.saldo += dato;
    }
    //
    public void retirar(double cantidad){
        if (this.saldo > 0) {
            this.saldo -= cantidad;
        }
        else System.out.println("No hay saldo");
    }
    
    public void mostrar(){
        System.out.println("Numero: " + this.numero);
        System.out.println("DNI: " + this.dni);
        System.out.println("Interes: " + this.interes);
        System.out.println("Saldo" + this.saldo);
        System.out.println("NROC: " + Cuenta.nroc);
    }
    
}
