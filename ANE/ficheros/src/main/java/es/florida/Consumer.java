package es.florida;

public class Child implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            try{
                Thread.sleep(100);
                System.out.println("hola mundo" );
            }catch(InterruptedException e){

            }
        }

    }
}
