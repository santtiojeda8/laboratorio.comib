import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*1*/
        /*
        int[] numbers=new int[10];
        int media_total=0;
        int media_posi=0;
        int media_nega=0;
        int counter_1=0;
        int counter_2=0;
        for (int i=0;i<10;i++){
            System.out.println("Ingrese un número");
            numbers[i]= leer.nextInt();
            media_total+=numbers[i];
        }
        media_total=media_total/10;
        System.out.println("La media total es "+media_total);
        System.out.println("Números Negativos");
        for (int i=0;i<10;i++){
            if (numbers[i]<0){
                System.out.println(numbers[i]);
                media_nega+=numbers[i];
                counter_1++;
            }
        }
        media_nega=media_nega/counter_1;
        System.out.println("La media de los negativos es "+media_nega);
        System.out.println("Números Positivos");
        for (int i=0;i<10;i++){
            if (numbers[i]>=0){
                System.out.println(numbers[i]);
                media_posi+=numbers[i];
                counter_2++;
            }
        }
        media_posi=media_posi/counter_2;
        System.out.println("La media de los números positivos es "+media_posi);
         */
        /*2*/
        /*
        int [] array_1=new int[10];
        int media_par=0;
        int counter=0;
        System.out.println("Ingrese 10 números");
        for (int i=0;i<10;i++){
            array_1[i]= leer.nextInt();
        }
        for (int i=0;i<10;i+=2){
            media_par+=array_1[i];
            counter+=1;
        }
        media_par=media_par/counter;
        System.out.println(media_par);
         */
        /*3*/
        /*
        System.out.println("Ingrese la cantidad de alumnos que hay en el curso");
        int alumnos= leer.nextInt();
        double [] notas=new double[alumnos];
        double media=0;
        int superior_media=0;
        for (int i=0;i<alumnos;i++){
            System.out.println("Ingrese la nota ");
            notas[i]= leer.nextDouble();
        }
        for (int j=0;j<alumnos;j++) {
            media += notas[j];
        }
        media=media/alumnos;
        for(int h=0;h<alumnos;h++){
            if(notas[h]>media){
                superior_media+=1;
            }
        }
        System.out.println("La nota media de los alumnos es "+media);
        System.out.println("La cantidad de alumnos con notas superios a la media es de "+superior_media);
         */
        /*4*/
        /*
        int []pares=new int[20];
        int counter=0;
        for (int i=0;i<40;i++){
            if(i%2==0){
                pares[counter]=i;
                counter++;
            }
        }
        for (int j=0;j<20;j++){
            System.out.print(pares[j]+" ");
        }
        */
        /*5*/
        /*
        int[]numbers=new int[10];
        int count_0=0;
        int count_posi=0;
        int count_nega=0;
        for (int i=0;i<10;i++){
            System.out.println("Ingrese un número");
            numbers[i]= leer.nextInt();
        }
        for (int j=0;j<10;j++){
            if(numbers[j]==0){
                count_0++;
            }else if(numbers[j]<0){
                count_nega++;
            }else if(numbers[j]>0){
                count_posi++;
            }
        }
        System.out.println("Iguales a O hay "+count_0);
        System.out.println("Positivos "+count_posi);
        System.out.println("Negativos "+count_nega);
        */
        /*6*/
        /*
        int[]numbers=new int[10];
        int posi=0;
        int nega=0;
        int count_posi=0;
        int count_nega=0;
        for (int i=0;i<10;i++){
            System.out.println("Ingrese un número");
            numbers[i]= leer.nextInt();
        }
        for (int j=0;j<10;j++){
            if(numbers[j]<0){
                count_nega++;
                nega+=numbers[j];
            }else if(numbers[j]>0){
                count_posi++;
                posi+=numbers[j];
            }
        }
        posi=posi/count_posi;
        nega=nega/count_nega;
        System.out.println("Media de n° positivios "+posi);
        System.out.println("Meida de n° negativos "+nega);
        */
        /*7*/
        /*
        System.out.println("Ingrese la cantidad de personas a atender");
        int canti_personas= leer.nextInt();
        int []altura=new int[canti_personas];
        int media_altura=0;
        int count_menor=0;
        int count_superior=0;
        for(int i=0;i<canti_personas;i++){
            System.out.println("Ingrese la altura del paciente "+(i+1));
            altura[i]= leer.nextInt();
            media_altura+=altura[i];
        }
        media_altura=media_altura/canti_personas;
        System.out.println("La altura media es "+media_altura+"cm");
        for (int j=0;j<canti_personas;j++){
            if(altura[j]>media_altura){
                count_superior++;
            }else{
                count_menor++;
            }
        }
        System.out.println("Cantidad superior a la media "+count_superior);
        System.out.println("Cantidad inferior a la media "+count_menor);
        */
        /*8*/
        /*
        String[] empleados = new String[5];
        double[] sueldo = new double[5];
        double sueldo_mayor=0;
        int max=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del empleado");
            empleados[i] = leer.next();
            System.out.println("Ingrese su sueldo mensual");
            sueldo[i]=leer.nextDouble();
            if(sueldo_mayor<sueldo[i]){
                sueldo_mayor=sueldo[i];
                max=i;
            }
        }
        System.out.println("El sueldo mayor es "+sueldo_mayor+" y corresponde al empleado "+empleados[max]);
        */
    }
}
