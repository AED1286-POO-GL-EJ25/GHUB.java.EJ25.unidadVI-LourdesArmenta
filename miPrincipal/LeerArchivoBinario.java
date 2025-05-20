package miPrincipal;

import java.io.FileInputStream;
import java.io.IOException;

public class LeerArchivoBinario {
    public static void main(String[] args) {
         try(FileInputStream fis = new FileInputStream("datos.dat")){
            int byteLeido;
            while((byteLeido = fis.read()) != -1){
                System.out.print(byteLeido+" ");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
