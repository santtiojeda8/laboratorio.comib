import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> dna = dna_creation();
        System.out.println(dna);
        /*
        System.out.println(line_validation(dna));
        System.out.println(column_validation(dna));
        System.out.println(diagonal_validation(dna));
        System.out.println(diagonal2_validation(dna));
        */
        boolean is_mutant= is_mutant(dna);
        if (is_mutant){
            System.out.println("Se encontró el gen mutante en el ADN del humano");
        }else{
            System.out.println("No se encontró el gen mutante en el ADN del humano");
        }
    }

    public static List<String> dna_creation() {
        Scanner write = new Scanner(System.in);
        List<String> dna = new ArrayList<>();
        String line_dna;
        int counter_dna = 0;
        do {
            int counter_line = 0;
            System.out.println("Ingrese una linea de ADN con los caracteres (A,C,G,T): ACGTGT");
            line_dna = write.next();
            if (line_dna.length() == 6) {
                for (int i = 0; i < line_dna.length(); i++) {
                    char letter = Character.toLowerCase(line_dna.charAt(i));
                    if (letter == 'a' || letter == 'c' || letter == 'g' || letter == 't') {
                        counter_line++;
                    }
                }
                if (counter_line == 6) {
                    counter_dna++;
                    System.out.println("Linea correcta");
                    dna.add(line_dna.toUpperCase());
                } else {
                    System.out.println("Linea Incorrecta");
                }
            } else {
                System.out.println("Linea Incorrecta");
            }
        } while (counter_dna != 6);
        return dna;
    }

    public static int line_validation(List<String> dna) {
        int line_counter = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (dna.get(i).charAt(j) == dna.get(i).charAt(j + 1) && dna.get(i).charAt(j + 1) == dna.get(i).charAt(j + 2)
                        && dna.get(i).charAt(j + 2) == dna.get(i).charAt(j + 3)) {
                    line_counter++;
                    if (line_counter >= 1) {
                        return line_counter;
                    }
                }
            }
        }
        return line_counter;
    }

    public static int column_validation(List<String> dna) {
        int column_counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (dna.get(i).charAt(j) == dna.get(i + 1).charAt(j) && dna.get(i + 1).charAt(j) == dna.get(i + 2).charAt(j)
                        && dna.get(i + 2).charAt(j) == dna.get(i + 3).charAt(j)) {
                    column_counter++;
                    if (column_counter >= 1) {
                        return column_counter;
                    }
                }
            }
        }
        return column_counter;
    }

    public static int diagonal_validation(List<String> dna) {
        int diagonal_counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (dna.get(i).charAt(j) == dna.get(i + 1).charAt(j + 1) && dna.get(i + 1).charAt(j + 1) == dna.get(i + 2).charAt(j + 2)
                        && dna.get(i + 2).charAt(j + 2) == dna.get(i + 3).charAt(j + 3)) {
                    diagonal_counter++;
                    if (diagonal_counter >= 1) {
                        return diagonal_counter;
                    }
                }
            }
        }
        return diagonal_counter;
    }

    public static int diagonal2_validation(List<String> dna) {
        int diagonal2_counter = 0;
        for (int i = 5; i > 2; i--) {
            for (int j = 0; j < 3; j++) {
                if (dna.get(i).charAt(j) == dna.get(i - 1).charAt(j + 1) && dna.get(i - 1).charAt(j + 1) == dna.get(i - 2).charAt(j + 2)
                        && dna.get(i - 2).charAt(j + 2) == dna.get(i - 3).charAt(j + 3)) {
                    diagonal2_counter++;
                    if (diagonal2_counter >= 1) {
                        return diagonal2_counter;
                    }
                }
            }
        }
        return diagonal2_counter;
    }
    public static boolean is_mutant(List<String> dna){
        int total_counter=0;
        total_counter=line_validation(dna) + column_validation(dna) + diagonal_validation(dna) + diagonal2_validation(dna);
        if (total_counter>=2){
            return true;
        }else{
            return false;
        }
    }
}