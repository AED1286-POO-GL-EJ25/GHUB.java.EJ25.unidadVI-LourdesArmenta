package miPrincipal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarEstudiante {
        public static void main(String[] args) {
        Estudiante estudiante = null;

        try (FileInputStream fileIn = new FileInputStream("estudiante.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            estudiante = (Estudiante) in.readObject();
            System.out.println("El objeto ha sido deserializado");
            System.out.println("ID: " + estudiante.getId());
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Correo Electrónico: " + estudiante.getCorreoElectronico());
            System.out.println("Contraseña: " + estudiante.getContrasena()); // Este campo será null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    
}
