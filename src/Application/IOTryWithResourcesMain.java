package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOTryWithResourcesMain {

    public static void main(String[] args) {
        String path = "C:\\Users\\Bruno\\IdeaProjects\\course3\\ola.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //Pode instanciar o objeto dentro do try sem o uso do bloco finally para fechar
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
