package miPrincipal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ModificarArchivo {
        public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt", true))) {
            bw.newLine();
            bw.write("Añadiendo una nueva línea al archivo existente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
