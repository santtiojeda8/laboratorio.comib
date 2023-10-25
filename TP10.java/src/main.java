public class main {
    public static void main(String []args){
        Perro p1=new Perro("Rocky","Boxer",9);
        System.out.println(p1);
        p1.Ladrar();
        Circulo c1 =new Circulo(5);
        c1.Area();
        c1.Circunferencia();
        Estudiantes e1=new Estudiantes();
        e1.Ingresar();
        System.out.println(e1);
        Libro l1 =new Libro("Harry Potter","J.K. Rowling",1980);
        System.out.println(l1);
        CuentaBancaria b1=new CuentaBancaria();
        b1.Depositar();
        b1.Retirar();
        Rectangulo r1=new Rectangulo(5,8);
        r1.Area();
        r1.Perimetro();
        Coche o1 = new Coche("Ford","Ranger",2016);
        o1.Acelerar();
        o1.Frenar();
        Pelicula i1= new Pelicula("SAW","Pedro",120);
        System.out.println(i1);
    }
}
