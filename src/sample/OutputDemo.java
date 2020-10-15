package sample;

import java.io.FileWriter;
import java.io.IOException;

public class OutputDemo {
    public static void main(String[] args) {
        try {
            /*  //prepisanie celeho suboru
            FileWriter fileWriter = new FileWriter("test", true);
            fileWriter.write("\ntoto je dalsia cast textu");
            fileWriter.close();*/

            FileWriter fileWriter = new FileWriter("test", true);
            fileWriter.write("\ntoto je dalsia cast textu");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
