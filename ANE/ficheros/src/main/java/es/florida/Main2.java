package es.florida;

import java.io.*;
import java.text.MessageFormat;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException{
        File file = new File("numbers.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bRead = new BufferedReader(reader);

        long startTime=System.currentTimeMillis();
        long startTime2=System.currentTimeMillis();
        int suma=0;
        int num=0;

        String line;
        for (int i = 0; i < 100 ; i++) {
            line= bRead.readLine();
            num = Integer.parseInt(line);
            suma= suma + num;
        }

        bRead.close();
        long endTime= System.currentTimeMillis();
        long endTime2= System.currentTimeMillis();

        System.out.println(MessageFormat.format("el resultado de la suma de tosos los numeros es: {0} ",suma));

        System.out.println(MessageFormat.format(" el proceso de la lectura ha tardado {0}ms " , (endTime - startTime) +"ms"));
        System.out.println(MessageFormat.format(" el proceso de la suma ha tardado {0}ms " , (endTime2 - startTime2) +"ms"));

    }
}
