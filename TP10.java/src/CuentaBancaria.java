import java.util.Scanner;

public class CuentaBancaria {
    private int saldo;
    private int nro_cuenta;
    Scanner leer=new Scanner(System.in);

    public CuentaBancaria() {
    }

    public CuentaBancaria(int saldo, int nro_cuenta) {
        this.saldo = saldo;
        this.nro_cuenta = nro_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(int nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }
    public void Depositar(){
        int deposito= leer.nextInt();
        saldo+=deposito;
        System.out.println("Depositó $"+deposito);
        System.out.println("Saldo "+saldo);
    }
    public void Retirar(){
        int retiro=leer.nextInt();
        if (retiro>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo-=retiro;
            System.out.println("Saldo restante "+saldo);
        }
    }
}
