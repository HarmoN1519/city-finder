package sda.pawoj;

import java.io.FileNotFoundException;
import java.util.List;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello World!");
        List<String> loadedRows = DataLoader.loadFile("xxx.csv");
        System.out.println(loadedRows);
    }
}
