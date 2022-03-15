package Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOBufferedWriterMain {
    //FileWriter recebe o path como argumento, e se adicionar o true apos ele nao criara um novo arquivos, e vai escrever abaixo.
    public static void main(String[] args) {
        String[] a = new String[]{"Hello", "Test", "Hello"};
        String path = "C:\\Users\\Bruno\\IdeaProjects\\course3\\ola.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : a) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
