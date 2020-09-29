package es.florida;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ejercicio 1

public class App {
    public static void sayHello() {
        System.out.println("hola mundo");
    }

    //ejercicio 2

    public static void arrayNombres() {
        String[] array = {"jordi", "jesus", "damia", "juan", "pablo", "rafa"};
        List<String> array2 = new ArrayList<>();
        array2.add("jordi");
        array2.add("jesus");
        array2.add("damia");
        array2.add("juan");
        array2.add("pablo");
        array2.add("rafa");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (String i : array2) {
            System.out.println(i);
        }


    }

    //ejercicio 3

    public static void sumarPares(int num){

        int suma=0;


        for (int i = 0; i < num; i++) {
             if(i%2==0){
                suma += i;

             }

        }
        System.out.println("la suma de numeros pares hasta el numero introducido es: "+suma);

    }

    //ejercicio 4

    public static void factorial() {
        int num = 15;
        int total = 1;
        for (int i = 1; i < num; i++) {
            total = total * i;
            System.out.println("el numero factorial de: " + num + " es: " + total);

        }
    }

    //ejercicio 5

    public static void mayorArray() {
        int[] listaNumeros = {45, 77, 9, 22, 1, 6};
        int numMayor, pos;
        numMayor = listaNumeros[0];
        pos = 0;

        for (int i = 1; i < listaNumeros.length; i++) {
            if (listaNumeros[i] > numMayor) {
                numMayor = listaNumeros[i];
                pos = i;
                System.out.println("el numero mayor del array es: " + numMayor + " y esta en la posicion: " + pos);
            }


        }
    }

    //ejercicio 6

    public static void numInvertido() {
        Scanner numero = new Scanner(System.in);
        int num[] = new int[5];
        int suma=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca números ("+i+"): " );
            num[i]= numero.nextInt();
            suma +=num[i];
        }


        for (int j = 4; j > 0; j--) {
            System.out.println("los numeros en el orden inverso son: " + num[j]);
        }

        System.out.println("la suma de los numeros son: "+suma);
    }

    //ejercicio 7

    public static void Salario(){
        Scanner datos = new Scanner(System.in);

        String nombre;
        int anyo;

        System.out.println("Introduzca el nombre: ");
        nombre=datos.next();
        System.out.println("Introduzca los anyos de experiencia: ");
        anyo= datos.nextInt();

        switch (anyo){
            case 0:
                System.out.println("Desarrollador Junior L1 – 15000-18000");
                break;
            case 1:
            case 2:
                System.out.println("Desarrollador Junior L2 – 18000-22000");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Desarrollador Junior L1 – 15000-18000");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Desarrollador Senior L2 – 28000-36000”");
                break;
            default:
                System.out.println("Analista / Arquitecto. Salario a convenir en base a rol");
                break;

        }




    }

    // ejercicio 8

    public static void intervalo(){
        long inicio = System.nanoTime();
        Scanner numeros = new Scanner(System.in);
        int num1,num2;
        String primo;
        int j;

        System.out.println("introduzca el primer numero: ");
        num1=numeros.nextInt();
        System.out.println("introduzca el segundo numero: ");
        num2=numeros.nextInt();

        for (int i= num1; i < num2; i++) {
                primo="";
            for ( j = i-1; j >= 2; j--) {
                if(i%j==0){
                    break;
                }


            }
            if(j==1){
                primo="numero primo";
            }
            System.out.println(i+"  "+primo);

        }

        long fin=System.nanoTime();
        double dif =(double) (fin-inicio)*1.0e-10;
        System.out.println("El programa dura " + dif + " seg");
    }

}