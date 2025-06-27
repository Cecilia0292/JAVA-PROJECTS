import java.util.Random;
import java.util.Scanner;

public class ContaBancaria{
    public int numeroConta;
    public String titularConta;
    public double saldoConta;

    Scanner scan = new Scanner(System.in);
    public ContaBancaria(){
        this.numeroConta = new Random().nextInt(1000,10000);
        this.saldoConta = 0;
}

public void sacarDinheiro(){
        try {
            System.out.println("Qual valor:"+this.saldoConta+"voce deseja sacar?");
            double valor =scan.nextDouble();
            if(valor>this.saldoConta){
                System.out.println("Seu saldo é insuficiente para saque!!");

            }else{
                this.saldoConta -= valor;
                System.out.println("Saque efetuado com sucesso!");
                System.out.println("Saldo atual:"+ this.saldoConta);
            }
        }catch (Exception e){
                System.out.println("Valor invalido!!");
        }
}
public void depositarDinheiro(){
    System.out.println("Qual valor:"+this.saldoConta+"voce deseja depositar?");
    double valor =scan.nextDouble();
    if(valor<0){
        System.out.println("Seu valor é insuficiente para deposito!!");
    }else{
        this.saldoConta += valor;
        System.out.println("Deposito efetuado com sucesso!");
        System.out.println("Saldo atual:"+ this.saldoConta);
    }
}
}
