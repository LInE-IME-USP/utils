
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Tulio Faria <tuliofaria@gmail.com>
 */
public class HowToUse {
    public static void main (String[] args)  {
                
        ZipUtil zip = new ZipUtil();
        zip.addFile("arquivo0.txt", "conteudo é do arquivo txt!");
        zip.addFile("binario/foto.jpg", new File("foto.jpg"));
        try{
            InputStream is = new FileInputStream("foto.jpg");
            zip.addFile("binario/foto via inputstream.jpg", is);
        }catch(Exception e){
        }
        
        zip.addFile("arquivo1.txt", "conteudo do arquivo txt!");
        zip.addFile("arquivo2.txt", "conteudo do arquivo txt!");
        zip.saveToFile("teste.zip");
        
        //zip.getZipAsOutputStream(); // get bytes if needed to submit via post
    }
}
