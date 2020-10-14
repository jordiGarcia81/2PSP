package es.florida;

import java.io.*;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) throws IOException {

       

        File file = new File("numbers.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter printer = new PrintWriter(writer);
        long startTime=System.currentTimeMillis();

        Random random = new Random();


        for (int i = 0; i < 100; i++) {
            printer.println(random.nextInt(100)+1);

        }


        long endTime= System.currentTimeMillis();

        printer.println(MessageFormat.format(" el proceso ha tardado  {0}" , (endTime - startTime) +"ms"));

        printer.close();
    }


}
