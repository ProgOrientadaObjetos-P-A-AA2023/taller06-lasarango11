/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor.clinica.Taller06;

/**
 *
 * @author Luis
 */
public class Medico {
     private String nombre;
    private String apellido;
    private String especialidad;
    private double sueldoMensual;
    
    public Medico (String n, String a, String e, double s) {
        nombre = n;
        apellido = a;
        especialidad = e;
        sueldoMensual = s;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public String obtenerEspecialidad() {
        return especialidad;
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
    
    public void establecerEspecialidad(String a) {
        especialidad = a;
    }
    
    public void establecerSueldoMensual(double a) {
        sueldoMensual = a;
    }
}
