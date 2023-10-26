import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros=new ArrayList<>();
        numeros.add(15);
        numeros.add(30);
        numeros.add(45);
        numeros.add(60);
        numeros.add(75);
        ArrayList<String> nombres=new ArrayList<>();
        nombres.add("Sebastian");
        nombres.add("Paulo");
        nombres.add("Santiago");
        nombres.add("Martina");
        System.out.println(numeros);
        System.out.println(nombres.size());
        nombres.remove(0);
        if (numeros.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista esta llena");
        }
        int num_mayor=0;
        for(int i:numeros){
            if(num_mayor<i){
                num_mayor=i;
            }
        }
        System.out.println("Numero mayor es "+num_mayor);
        ArrayList <Integer> nuevos_num=new ArrayList<>();
        nuevos_num=numeros;
        System.out.println(nuevos_num);
        for (int j=numeros.size()-1;j>-1;j--){
            int num=numeros.get(j);
            System.out.print(num+" ");
        }
        System.out.println("");
        nuevos_num.addAll(numeros);
        System.out.println(nuevos_num);
        for(int i=0;i<numeros.size();i++) {
            int num1 = numeros.get(i);
            if(num1%2==0){
                numeros.remove(i);
            }
        }
        System.out.println(numeros);
        int count=0;
        for(String i:nombres){
            if(i.equals("Martina")){
                int num2=count;
                System.out.println("Indice "+num2);
            }
            count++;
        }
        if(numeros==nuevos_num){
            System.out.println("Las listas son iguales");
        }
        int min=numeros.get(0);
        for(int i=0;i<numeros.size();i++){
            int num3=numeros.get(i);
            if(num3<min){
                min=num3;
            }
        }
        System.out.println("El número mínimo es "+min);
        int suma=0;
        for(int i:numeros){
            suma+=i;
        }
        System.out.println(suma);
        HashSet<Integer> sin_repetir=new HashSet<>();
        sin_repetir.addAll(numeros);
        System.out.println(sin_repetir);
        int suma1=0;
        for(int i=0;i<numeros.size();i++){
            if(i%2==0){
                suma1+=numeros.get(i);
            }
        }
        System.out.println(suma1);
        if(numeros.contains(12)){
            System.out.println("Se encontro");
        }else{
            System.out.println("No se encontro");
        }
        int Longi=0;
        String palabra="";
        for(String i:nombres){
            if(Longi<i.length()){
                palabra=i;
                Longi=i.length();
            }
        }
        System.out.println(palabra);
        int promedio=suma/(numeros.size());
        System.out.println(promedio);
        Collections.sort(numeros);
        System.out.println(numeros);
        int min1=30;
        for (int i = 0; i < numeros.size(); i++) {
            int num4=numeros.get(i);
            if(num4>min1){
                numeros.remove(i);
            }
        }
        System.out.println(numeros);
        int count1=0;
        for(String i:nombres){
            if(i.equals("Martina")){
                count1++;
            }
        }
        System.out.println("Aparece "+count1);
        Collections.sort(nombres);
        System.out.println(nombres);
    }
}