package Application;

import java.io.File;

public class IOFileManipulation {

    public static void main(String[] args) {

        String path = "C:\\Users\\Bruno\\IdeaProjects\\";

        File pathFile = new File(path);
        File[] folders = pathFile.listFiles(File::isDirectory);
        System.out.println("------Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = pathFile.listFiles(File::isFile);
        System.out.println("-----Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean isCreate = new File(path + "\\newfolder").mkdir();
        System.out.println("Diretory created sucessfully: "+isCreate);
    }
}
