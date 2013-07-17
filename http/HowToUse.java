
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Tulio Faria <tuliofaria@gmail.com>
 */
public class HowToUse {

    public static void main(String[] args) {

        // apenas para ter algo para enviar via POST
        ZipUtil zip = new ZipUtil();
        zip.addFile("arquivo0.txt", "conteudo é do arquivo txt!");
        zip.addFile("binario/foto.jpg", new File("foto.jpg"));
        try {
            InputStream is = new FileInputStream("foto.jpg");
            zip.addFile("binario/foto via inputstream.jpg", is);
        } catch (Exception e) {
        }

        zip.addFile("arquivo1.txt", "conteudo do arquivo txt!");
        zip.addFile("arquivo2.txt", "conteudo do arquivo txt!");


        HttpUtil httpUtil = new HttpUtil();
        // variaveis querystring (chegam como $_GET no PHP)
        httpUtil.addQueryStringVariable("teste", "teste");
        // variaveis post
        httpUtil.addPostVariable("teste1", "testePost");
        // podemos enviar um arquivo em disco
        httpUtil.addFile("arquivo", "teste.zip", new File("teste.zip"));
        // podemos enviar um arquivo em memoria (arquivo onde temos apenas byte[])
        httpUtil.addFile("arquivo2", "teste.zip", zip.getZipAsOutputStream().toByteArray());
        try {
            httpUtil.makePostRequest("http://localhost/Mestrado/ead/zip-php/");
            System.out.println(httpUtil.getResponse());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
