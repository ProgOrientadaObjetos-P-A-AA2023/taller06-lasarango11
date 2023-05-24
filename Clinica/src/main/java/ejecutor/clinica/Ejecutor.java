/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejecutor.clinica;

import ejecutor.clinica.Taller06.Ciudad;
import ejecutor.clinica.Taller06.Enfermero;
import ejecutor.clinica.Taller06.Hospital;
import ejecutor.clinica.Taller06.Medico;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombreHospital;
        String direcc;
        String nombreCiudad;
        String provincia;
        int numEspecialidades;
        int numDoc;
        int numEnfermeros;
        

        System.out.println("---Programa para administrar hospitales del país---");
        System.out.println("--Datos del hospital--");
        System.out.println("Ingrese el nombre: ");
        nombreHospital = entrada.nextLine();

        System.out.println("Ingrese la dirección: ");
        direcc = entrada.nextLine();

        System.out.println("Ingrese la ciudad en la que está ubicado: ");
        nombreCiudad = entrada.nextLine();

        System.out.println("Ingrese la provincia: ");
        provincia = entrada.nextLine();

        
        Ciudad ciudad = new Ciudad(nombreCiudad, provincia);

        System.out.println("Ingrese el número de especialidades: ");
        numEspecialidades = entrada.nextInt();

        System.out.println("Ingrese el número de médicos: ");
        numDoc = entrada.nextInt();

        System.out.println("Ingrese el número de enfermeros(as): ");
        numEnfermeros = entrada.nextInt();

        
        Medico[] medicos = new Medico[numDoc];
        Enfermero[] enfermeros = new Enfermero[numEnfermeros];

        String nombre;
        String apellido;
        String especialidad;
        String tipo;
        double sueldoMensual;
        
        entrada.nextLine();

        for (int i = 0; i < numDoc; i++) {
            System.out.println("Ingrese el nombre del médico [" + (i + 1) + "]:");
            nombre = entrada.next();

            System.out.println("Ingrese el apellido del médico[" + (i + 1) + "]:");
            apellido = entrada.next();

            System.out.println("Ingrese la especialidad del médico [" + (i + 1) + "]:");
            especialidad = entrada.next();

            System.out.println("Ingrese el sueldo mensual del médico[" + (i + 1) + "]:");
            sueldoMensual = entrada.nextDouble();

            medicos[i] = new Medico(nombre, apellido, especialidad,
                    sueldoMensual);
            
        }

        entrada.nextLine();

        for (int i = 0; i < numEnfermeros; i++) {
            System.out.println("Ingrese el nombre del enfermero[" + (i + 1) + "]:");
            nombre = entrada.next();

            System.out.println("Ingrese el apellido del enfermero[" + (i + 1) + "]:");
            apellido = entrada.next();

            System.out.println("Ingrese el tipo (nombramiendo o contrato)"
                    + "del enfermero [" + (i + 1) + "]:");
            tipo = entrada.next();

            System.out.println("Ingrese el sueldo mensual del enfermero[" + (i + 1) + "]:");
            sueldoMensual = entrada.nextDouble();

            enfermeros[i] = new Enfermero(nombre, apellido, tipo,
                    sueldoMensual);
           
        }

        Hospital hospital = new Hospital(nombreHospital, direcc, ciudad,
                medicos, enfermeros, numEspecialidades);
      

       
        hospital.calcularSueldos(medicos, enfermeros);

      
        System.out.printf("\n%s\n", hospital);
    }

}
