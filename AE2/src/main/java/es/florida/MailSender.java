package es.florida;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MailSender implements Runnable {
    File file = new File("miembros.txt");

    private String ultimoCorreo;
    public MailSender(String ultimoCorreo) {
        this.ultimoCorreo=ultimoCorreo;
    }

    public MailSender(){

    }

    @Override
    public void run() {
        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null){
                if(ultimoCorreo!=linea){
                    System.out.println("Correo enviado a: "+linea+" Informando del nuevo miembro: "+ultimoCorreo) ;
                }

            }

            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
