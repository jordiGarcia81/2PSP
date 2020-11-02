package es.florida;

import java.io.*;
import java.util.Random;

public class MemberCreator implements Runnable  {
    File file = new File("miembros.txt");


    public MemberCreator() {
    }

    @Override
    public void run() {

        while(true){
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            CrearMiembros();
        }
    }

    private String generar(){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return "\n"+output;
    }
    public void CrearMiembros() {


        try {
            BufferedWriter fileBufferedWriter = null;
            if(file.exists()){
                fileBufferedWriter = new BufferedWriter(new FileWriter(file, true));
                fileBufferedWriter.write(generar());
            } else {
                fileBufferedWriter = new BufferedWriter(new FileWriter(file));
                fileBufferedWriter.write(generar());

            }
                fileBufferedWriter.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
