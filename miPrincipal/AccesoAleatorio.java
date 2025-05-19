package miPrincipal;
import java.io.IOException;
import java.io.RandomAccessFile;


public class AccesoAleatorio {
        public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("datos.dat", "rw")) {
            // Escribir datos en posiciones específicas
            raf.seek(0); // Moverse al inicio del archivo
            raf.writeInt(100); // Escribir un entero en la posición 0

            raf.seek(4); // Moverse a la posición 4 (después del entero)
            raf.writeDouble(3.14); // Escribir un double en la posición 4

            raf.seek(12); // Moverse a la posición 12 (después del double)
            raf.writeUTF("Hola"); // Escribir una cadena en la posición 12

            // Leer datos de posiciones específicas
            raf.seek(0); // Moverse al inicio del archivo
            int entero = raf.readInt(); // Leer un entero de la posición 0
            System.out.println("Entero: " + entero);

            raf.seek(4); // Moverse a la posición 4
            double doble = raf.readDouble(); // Leer un double de la posición 4
            System.out.println("Double: " + doble);

            raf.seek(12); // Moverse a la posición 12
            String cadena = raf.readUTF(); // Leer una cadena de la posición 12
            System.out.println("Cadena: " + cadena);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
