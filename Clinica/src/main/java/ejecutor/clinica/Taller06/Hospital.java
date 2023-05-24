/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor.clinica.Taller06;

/**
 *
 * @author Luis
 */
public class Hospital {
    private String nombre;
    private String direcc;
    private Ciudad ciudad;
    private Medico [] medicos;
    private Enfermero[] enfermeros;
    private double sueldos;
    private int especialidades;
    
    public Hospital (String n, String d, Ciudad c, Medico[] m, Enfermero[] e, int es) {
        nombre = n;
        direcc = d;
        ciudad = c;
        medicos = m;
        enfermeros = e;
        especialidades = es;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerDirecc() {
        return direcc;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public  Medico[] obtenerMedico() {
        return medicos;
    }
    
    public Enfermero[] obtenerEnfermero() {
        return enfermeros;
    }
    
    public double obtenerSueldos() {
        return sueldos;
    }
    
    public int obtenerEspecialidades() {
        return especialidades;
    }
    
    public void establecerNombre(String a) {
        nombre = a;
    }
    
    public void establecerDirecc(String a) {
        direcc = a;
    }
    
    public void establecerCiudad(Ciudad a) {
        ciudad = a;
    }
    
    public void establecerMedico(Medico[] a) {
        medicos = a;
    }
    
    public void establecerEnfermero(Enfermero[] a) {
        enfermeros = a;
    }
    
   
    public void calcularSueldos(Medico[] a, Enfermero[] b) {
        double suma1=0;
        double suma2=0;
        for (int i=0;i<a.length;i++) {
            suma1 += a[i].obtenerSueldoMensual();
        }
        for (int i=0;i<b.length;i++) {
            suma2 += b[i].obtenerSueldoMensual();
        }
        sueldos = suma1+suma2;
    }
    
    public void establecerEspecialidades (int e) {
        especialidades = e;
    }
    
    @Override
    public String toString(){
       
               
        String cadena = String.format("HOSPITAL %S\nDirección: %s\n"
                + "Ciudad: %s\nProvincia: %s\nNúmero de especialidades: %d\n",
                obtenerNombre(),obtenerDirecc(),obtenerCiudad().obtenerNombre(),
                obtenerCiudad().obtenerProvincia(),obtenerEspecialidades());
       
        cadena = String.format("%sListado de médicos\n",cadena);
        
        for (int i = 0; i < obtenerMedico().length; i++) {
            cadena = String.format("%s- %s %s - %.2f - %s\n",
                    cadena, 
                    obtenerMedico()[i].obtenerNombre(),
                    obtenerMedico()[i].obtenerApellido(),
                    obtenerMedico()[i].obtenerSueldoMensual(),
                    obtenerMedico()[i].obtenerEspecialidad());
        }
        
        cadena = String.format("%s\nListado de enfermeros(as)\n",cadena);
        
        for (int i = 0; i < obtenerEnfermero().length; i++) {
            cadena = String.format("%s- %s %s - %.2f - %s\n", 
                    cadena, 
                    obtenerEnfermero()[i].obtenerNombre(),
                    obtenerEnfermero()[i].obtenerApellido(),
                    obtenerEnfermero()[i].obtenerSueldoMensual(),
                    obtenerEnfermero()[i].obtenerTipo());
        }
        
        cadena = String.format("%s\nTotal de Sueldos a pagar: %.2f",
                cadena, obtenerSueldos());
        return cadena;
    }
}
