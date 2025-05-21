package miPrincipal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("nuevoArchivo.txt"))){
            String linea;
            while ((linea = br.readLine()) != null){
                
                System.out.println(linea);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        }
        
    }