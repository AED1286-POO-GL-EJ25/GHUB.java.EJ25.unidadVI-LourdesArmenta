package miPrincipal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaSecuencial {
        public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("estudiantes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int edad = Integer.parseInt(datos[2]);
                Estudiante estudiante = new Estudiante(id, nombre, edad);
                System.out.println("Leído: " + estudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
