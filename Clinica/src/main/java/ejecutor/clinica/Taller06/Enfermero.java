/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor.clinica.Taller06;

/**
 *
 * @author Luis
 */
public class Enfermero {
     private String nombre;
    private String apellido;
    private String tipo;
    private double sueldoMensual;
    
    public Enfermero (String n, String a, String t, double s) {
        nombre = n;
        apellido = a;
        tipo = t;
        sueldoMensual = s;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public String obtenerTipo() {
        return tipo;
    }
    
    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
    
    public void establecerNombre(String a) {
        nombre = a;
    }
    
    public void establecerApellido(String a) {
        apellido = a;
    }
    
    public void establecerTipo(String a) {
        tipo = a;
    }
    
    public void establecerSueldoMensual(double a) {
        sueldoMensual = a;
    }
}
