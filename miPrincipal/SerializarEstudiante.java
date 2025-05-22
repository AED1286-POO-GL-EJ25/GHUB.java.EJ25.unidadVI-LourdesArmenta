package miPrincipal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarEstudiante {
        public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(1, "Juan Pérez", 20, "juan.perez@example.com", "miContrasenaSecreta");

        try (FileOutputStream fileOut = new FileOutputStream("estudiante.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(estudiante);
            System.out.println("El objeto ha sido serializado y guardado en estudiante.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
