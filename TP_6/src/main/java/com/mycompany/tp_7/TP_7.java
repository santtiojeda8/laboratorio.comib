/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TP_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese 10 n° enteros para caluclar la media");
//        int media = 0;
//        int num;
//        int [] nums = new int [10];
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ingrese un número");
//            num = leer.nextInt();
//            nums[i]=num;
//            media+=num;
//        }
//        for (int i:nums){
//            System.out.print(i+" ");
//        }
//        media= media/10;
//        System.out.println("");
//        System.out.println("La media de los números es "+media);
        
//        System.out.println("Ingrese 10 n° enteros para calcular la media");
//        int [] nums1 = new int[10];
//        int media1=0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ingrese un número");
//            nums1[i]=leer.nextInt();
//        }
//        for (int i = 0; i < 10; i+=2) {
//            media1+=nums1[i];
//        }
//        for(int i:nums1){
//            System.out.print(i+" ");
//        }
//        System.out.println("");
//        media1=media1/5;
//        System.out.println("La media de los números de posición par es "+media1);
      
//        System.out.println("Ingrese la cantidad de alumnos que dedsea cargar");
//        double media2=0;
//        int cant = leer.nextInt();
//        double [] notas= new double [cant];
//        System.out.println("A continuación, ingrese la nota de los alumnos");
//        for (int i = 0; i < cant; i++) {
//            System.out.println("Ingrese la noda del alumno "+(i+1));
//            notas[i]=leer.nextDouble();
//        }
//        for (int i = 0; i < cant; i++) {
//            media2+=notas[i];
//        }
//        media2=media2/cant;
//        System.out.println("La media de las notas es "+media2);
//        for (int i = 0; i < cant; i++) {
//            if(notas[i]>media2){
//                System.out.println("El alumno n°"+(i+1)+" tiene una nota superior a la media");
//            }else{
//                System.out.println("El alumno n°"+(i+1)+" tiene una nota inferior a la media");
//            }
//        }
      
//        int [] pares = new int[20];
//        int j=0;
//        for (int i = 0; i < 40; i+=2) {
//            pares[j]=i;
//            j++;
//        }
//        for (int i:pares){
//            System.out.print(i+" ");
//        }
        
//        System.out.println("Ingrese 10 números");
//        int count0=0;
//        int count_nega=0;
//        int count_posi=0;
//        int [] nums3=new int [10];
//        for (int i = 0; i < 10; i++) {
//            nums3[i]=leer.nextInt();
//        }
//        for (int i = 0; i < 10; i++) {
//            if(nums3[i]==0){
//                count0++;
//            }else if(nums3[i]>0){
//                count_posi++;
//            }else if (nums3[i]<0){
//                count_nega++;
//            }
//        }
//        System.out.println("Numeros Positivos = "+count_posi);
//        System.out.println("Numeros Negativos = "+count_nega);
//        System.out.println("Numeros Igual a Cero = "+count0);
        
//        System.out.println("Ingrese 10 números");
//        double media_posi=0;
//        double media_nega=0;
//        int count0=0;
//        int count_nega=0;
//        int count_posi=0;
//        int [] nums3=new int [10];
//        for (int i = 0; i < 10; i++) {
//            nums3[i]=leer.nextInt();
//        }
//        for (int i = 0; i < 10; i++) {
//            if(nums3[i]==0){
//                count0++;
//            }else if(nums3[i]>0){
//                count_posi++;
//                media_posi+=nums3[i];
//            }else if (nums3[i]<0){
//                count_nega++;
//                media_nega+=nums3[i];
//            }
//        }
//        System.out.println("Numeros Positivos = "+count_posi);
//        System.out.println("Numeros Negativos = "+count_nega);
//        System.out.println("Numeros Igual a Cero = "+count0);
//        media_posi=media_posi/count_posi;
//        media_nega=media_nega/count_nega;
//        System.out.println("La media de los números positivos es "+media_posi);
//        System.out.println("La media de los números negativos es "+media_nega);
        
//        System.out.println("Ingrese la cantida de personas a evaluar");
//        int count_mas=0;
//        int count_menos=0;
//        int person=leer.nextInt();
//        int altura;
//        double media=0;
//        int [] people = new int [person];
//        for (int i = 0; i < person; i++) {
//            do{
//                System.out.println("Ingrese la altura en cm");
//                altura=leer.nextInt();
//            }while(altura<0 && altura>250);
//            people[i]=altura;
//            media+=altura;
//        }
//        media=media/person;
//        for (int i = 0; i < person; i++) {
//            if(people[i]>media){
//                count_mas++;
//            }else if(people[i]<media){
//                count_menos++;
//            }
//        }
//        System.out.println("La media de altura es "+media);
//        System.out.println("Hay "+count_mas+" mas altas a la media");
//        System.out.println("Hay "+count_menos+" mas bajas a la media");
        
//        double mayor=0;
//        double [] sueldos = new double [20];
//        String [] empleados = new String [20];
//        for (int i = 0; i < 20; i++) {
//            System.out.println("Ingrese el nombre del empleado");
//            empleados [i]=leer.next();
//            System.out.println("Ingrese el sueldo del empleado "+empleados[i]);
//            sueldos[i]=leer.nextDouble();
//            if(sueldos[i]>mayor){
//                mayor=sueldos[i];
//            }
//        }
//        for (int i = 0; i < 20; i++) {
//            if(sueldos[i]==mayor){
//                System.out.println("El sueldo mas alto el corresponde a "+empleados[i]+" y es de $"+sueldos[i]);
//            }
//        }
        
//        System.out.println("Ingrese el límite del array");
//        int tamaño = leer.nextInt();
//        int [] numeros= new int [tamaño];
//        System.out.println("Ingrese desde que número desea que se llene");
//        int desde = leer.nextInt();
//        System.out.println("Ingrese el límite que desee");
//        int hasta = leer.nextInt();
//        int [] numero = aleatorio(numeros,tamaño,desde,hasta);
//        for (int i:numero){
//            System.out.print(i+" ");
//        }
        
        
    }
//    public static int [] aleatorio (int []numeros, int tamaño ,int desde,int hasta){
//        Random random = new Random();
//        for (int i = 0; i < tamaño; i++) {
//            numeros[i]=random.nextInt(hasta-desde+1)+desde;
//        }
//        return numeros;
//    }
}
