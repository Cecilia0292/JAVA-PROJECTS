//Desafio faça um codigo que apos pedir ao usuario o valor do raio do circulo, calcule e informe sua area

import java.util.Scanner;

public class CalculoAreaCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor do raio?");
        double raio = Double.valueOf(scan.next());
        double pi = 3.14;
        double calculo = pi * (raio * raio);
        //Math.PI * (raio * raio)
        System.out.println("O caculo da área do circulo é " + calculo+ " metros quadrados.");

    }
}
