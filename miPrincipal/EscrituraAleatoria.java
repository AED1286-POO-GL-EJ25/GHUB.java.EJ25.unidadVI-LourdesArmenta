package miPrincipal;

import java.io.IOException;
import java.io.RandomAccessFile;

public class EscrituraAleatoria {
        public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1, "Juan Pérez", 20);
        Estudiante estudiante2 = new Estudiante(2, "Ana Gómez", 22);

        try (RandomAccessFile raf = new RandomAccessFile("estudiantes.dat", "rw")) {
            // Escribir el primer estudiante
            raf.seek(0);
            raf.writeInt(estudiante1.getId());
            raf.writeUTF(estudiante1.getNombre());
            raf.writeInt(estudiante1.getEdad());

            // Escribir el segundo estudiante
            raf.seek(raf.length());
            raf.writeInt(estudiante2.getId());
            raf.writeUTF(estudiante2.getNombre());
            raf.writeInt(estudiante2.getEdad());

            System.out.println("Los objetos han sido escritos en estudiantes.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
