import java.util.Scanner;

public class Estudiantes {
    private String name;
    private int age;
    private int id;
    Scanner leer=new Scanner(System.in);

    public Estudiantes() {
    }

    public Estudiantes(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void Ingresar(){
        System.out.println("Ingrese el nombre");
        this.name=leer.next();
        System.out.println("Ingrese la edad");
        this.age=leer.nextInt();
        System.out.println("Ingrese el número de identificación");
        this.id=leer.nextInt();
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
