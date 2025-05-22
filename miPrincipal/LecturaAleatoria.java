package miPrincipal;

import java.io.IOException;
import java.io.RandomAccessFile;

public class LecturaAleatoria {
        public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("estudiantes.dat", "r")) {
            while (raf.getFilePointer() < raf.length()) {
                int id = raf.readInt();
                String nombre = raf.readUTF();
                int edad = raf.readInt();
                Estudiante estudiante = new Estudiante(id, nombre, edad);
                System.out.println("Leído: " + estudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
