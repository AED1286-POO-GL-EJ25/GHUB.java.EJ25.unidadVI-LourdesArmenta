package miPrincipal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraSecuencial {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante(1, "Juan Pérez", 20);
        Estudiante estudiante2 = new Estudiante(2, "Ana Gómez", 22);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("estudiantes.txt", true))) {
            bw.write(estudiante1.toString());
            bw.newLine();
            bw.write(estudiante2.toString());
            bw.newLine();
            System.out.println("Los objetos han sido escritos en estudiantes.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



    

