/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturas;

import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Factura {
    private Scanner sc=new Scanner(System.in);
    private String nom_bre;
    private String ciu_dad;
    private String Dire_cc;
    public int telefono;
    public int edad;
    public int fecha;
    public String value01;        
    public double value02;        
    public double value03;        
    public double value04;     
    Factura f = new Factura();
    //public valor[][]= new valor[][];
    
    public Factura(String nom_bre, String ciu_dad, String Dire_cc, int telefono, int edad, int fecha, String value01, double value02, double value03, double value04) {
        this.nom_bre = nom_bre;
        this.ciu_dad = ciu_dad;
        this.Dire_cc = Dire_cc;
        this.telefono = telefono;
        this.edad = edad;
        this.fecha = fecha;
        this.value01 = value01;
        this.value02 = value02;
        this.value03 = value03;
        this.value04 = value04;
    }
      public Factura() {
    }
      public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNom_bre() {
        return nom_bre;
    }

    public void setNom_bre(String nom_bre) {
        this.nom_bre = nom_bre;
    }

    public String getCiu_dad() {
        return ciu_dad;
    }

    public void setCiu_dad(String ciu_dad) {
        this.ciu_dad = ciu_dad;
    }

    public String getDire_cc() {
        return Dire_cc;
    }

    public void setDire_cc(String Dire_cc) {
        this.Dire_cc = Dire_cc;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getValue01() {
        return value01;
    }

    public void setValue01(String value01) {
        this.value01 = value01;
    }

    public double getValue02() {
        return value02;
    }

    public void setValue02(double value02) {
        this.value02 = value02;
    }

    public double getValue03() {
        return value03;
    }

    public void setValue03(double value03) {
        this.value03 = value03;
    }

    public double getValue04() {
        return value04;
    }

    public void setValue04(double value04) {
        this.value04 = value04;
    }
    
    public Factura llenarFactura(){
        System.out.println("Ingrese los datos del usuario");
        System.out.println("Nombres Completos");
        f.setNom_bre(sc.next());
        System.out.println("Direccion");
        f.setDire_cc(sc.next());
        System.out.println("Ciudad");
        f.setCiu_dad(sc.next());
        System.out.println("Edad");
        f.setEdad(sc.nextInt());
        System.out.println("Telefono");
        f.setTelefono(sc.nextInt());
        System.out.println("Fecha");
        f.setFecha(sc.nextInt());
        return f;
    }
    
   /* public Factura llenadoValor(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("");
            }
        }
    }
    public Factura calculo(){
        
    }*/
}
