package Application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IOScannerReadMain {

    public static void main(String[] args) {

        File file = new File("ola.txt"); //Pode passar o diretorio do arquivo, ou apenas o nome do arquivo para cria-lo na raiz do projeto
        Scanner sc = null;
        try {
            file.createNewFile(); //Retorna true se o arquivo ja foi criado se retornar false o arquivo e criado.
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null)
                sc.close();
        }

    }

}
