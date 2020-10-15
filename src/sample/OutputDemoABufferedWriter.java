package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputDemoABufferedWriter {
    public static void main(String[] args) {
        try {
            //FileWriter fileWriter = new FileWriter("test", true);
            //BufferedWriter bufferedWriter01 = new BufferedWriter(fileWriter);
            BufferedWriter bufferedWriter02 = new BufferedWriter(new FileWriter("test", true));
            bufferedWriter02.newLine();
            bufferedWriter02.write("BufferedWrider novy zapis");
            bufferedWriter02.close();




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
