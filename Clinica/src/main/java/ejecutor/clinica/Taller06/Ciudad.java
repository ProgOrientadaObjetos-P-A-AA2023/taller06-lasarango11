/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor.clinica.Taller06;

/**
 *
 * @author Luis
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad (String n, String p) {
        nombre = n;
        provincia = p;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerProvincia() {
        return provincia;
    }
    
    public void establecerNombre(String c) {
        nombre = c;
    }
    
    public void establecerProvincia(String c) {
        provincia = c;
    }
}
