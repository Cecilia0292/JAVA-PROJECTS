import java.util.Scanner;

public class Metodo {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        exMedia(scan);
    }
    public static  void exMedia(Scanner scan){
        System.out.println("Digite as 4 notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();

        double media = (nota1+nota2+nota3+nota4) / 4;
        System.out.println("Média final é " + media);
    }
}
