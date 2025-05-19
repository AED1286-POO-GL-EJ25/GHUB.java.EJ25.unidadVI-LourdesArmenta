package miPrincipal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
     public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"))){
            bw.write("Hola, mundo!");
            bw.newLine();
            bw.write("Este es un ejemplo de escritura de un archivo");
            
            
        }catch(IOException e){
            e.printStackTrace();
        }

        }
    
}