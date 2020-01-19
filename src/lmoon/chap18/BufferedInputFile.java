package lmoon.chap18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    public static String read(String fileName) throws IOException{
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );
        String s = null;
        StringBuilder sb = new StringBuilder();
        while ((s = reader.readLine()) != null) {
            sb.append(s).append("\n");
        }
        reader.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read(" xxxx"));
    }
}
