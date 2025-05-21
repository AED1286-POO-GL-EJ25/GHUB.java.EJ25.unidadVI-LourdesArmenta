package miPrincipal;

import java.io.File;
import java.io.IOException;

public class CrearArchivo {
        public static void main(String[] args) {
        try {
            File archivo = new File("nuevoArchivo.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
