package es.florida;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void sayHello() {
        System.out.println("hola mundo");
    }

    public static void arrayNombres(){
    String[]array={"jordi","jesus","damia","juan","pablo","rafa"};
    List<String> array2 = new ArrayList<>();
        array2.add("jordi");
        array2.add("jesus");
        array2.add("damia");
        array2.add("juan");
        array2.add("pablo");
        array2.add("rafa");

        for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for(String i: array2){
            System.out.println(i);
        }


    }
}

