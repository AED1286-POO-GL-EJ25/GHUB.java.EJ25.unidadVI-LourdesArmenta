package miPrincipal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class EscribeCamino {
    public static void main(String[] args) {
        if (args.length < 1) {
             System.out.println("Por favor, proporciona el nombre del archivo como argumento.");
             return;
        }
        String nombreArchivo = args[0];

        boolean modo = new File(nombreArchivo).exists(); // Inicializa 'modo' según la existencia del archivo
        try (BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new FileOutputStream(nombreArchivo, modo))) {
            System.out.println("Pueblo_A distancia Pueblo_B");
            String cad;
            while ((cad = entrada.readLine()) != null && cad.length() > 0) {
                if (datosValidos(cad)) {
                    pw.println(cad);
            }
        }
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static boolean datosValidos(String cad) throws Exception {
        StringTokenizer cd = new StringTokenizer(cad);
        boolean sw = cd.countTokens() == 3;
        cd.nextToken(); // Pueblo_A
        sw = sw && (Integer.parseInt(cd.nextToken()) > 0); // distancia
        return sw;
    }

    
}
