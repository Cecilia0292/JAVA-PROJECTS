import java.util.Scanner;

public class JavaIntrodution {
    public static void main(String[] args) { // metodo principal onde a execução comeca
        System.out.println("Hello Java");
        Scanner scan = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário

        System.out.println("Qual o seu nome?");
        String nome = scan.next(); // Captura uma palavra (até o primeiro espaço)
        System.out.println("Bem vindo(a), " + nome);

        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt(); // Captura um número inteiro
        System.out.println("Você tem " + idade + " anos.");

        System.out.println("Digite um numero: ");
        double num1 = scan.nextDouble();

        System.out.println("Digite outro numero: ");
        double num2 = scan.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;


        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao);
        System.out.println("Resultado da divisão: " + divisao);

        //Variáveis e Tipos de Dados

        int numero = 10; // Número inteiro

        double preco = 5.99; // Número decimal
        
        char letra = 'A'; // Caractere
        boolean ativo = true; // Valor lógico (true ou false)
        String texto = "Olá, mundo!"; // Texto (String é um objeto)
        //Operadores

        int soma = 5 + 3; // Adição
        int subtracao = 10 - 4; // Subtração
        int multiplicacao = 6 * 2;
        double divisao = 8d / 2;//d ao invés de .0
        int resto = 10 % 3; // Módulo (resto da divisão)
        boolean maior = 10 > 5; // true
        boolean igual = (5 == 5); // true
        boolean diferente = (5 != 3); // true

        //Estruturas condicionais- Usamos if, else e switch para tomar decisões:
        //if
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        //Ternario
            System.out.println(idade >= 18 ? "Você é maior de idade.": "Você é menor de idade." );
        //Switch
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                System.out.println("Dia a feliz!!!");
                break;
            default:
                System.out.println("Outro dia da semana");
        }
        //Laços de repetição- for, while e do-while para repetir ações:
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
        }
        // While loop- a condição é verificada antes de executar o bloco de código
        int contador = 0;
        while (contador < 5) {
            System.out.println("Número: " + contador);
            contador++;
        }
        // Do-while loop- o bloco de código sempre será executado pelo menos uma vez, pois a condição é verificada depois da execução
        int x = 0;
        do {
            System.out.println("Executando pelo menos uma vez.");
            x++;
        } while (x < 1);
        /** Métodos-o Java, métodos e funções não são exatamente a mesma coisa, mas na prática,
         os métodos desempenham o papel das funções. Em Java, não existem funções fora de uma classe.
         Todo bloco de codigo reutilizavel dentro de uma classe e chamado de metodo.
         public class Calculadora {
         public static int somar(int a, int b) {
         return a + b;
         }
         public static void main(String[] args) {
         int resultado = somar(5, 3);
         System.out.println("Resultado: " + resultado);
         }
         }
         **/
        /** Trabalhando com vetores- nomeia sempre no plural, tem tamanho definido

        double[] notas = new double[4];//Vetor dividido em 4 espaços - inicia em 0
         notas[0] = scan.nextDouble();
        notas[1] = scan.nextDouble();
        notas[2] = scan.nextDouble();
        notas[3] = scan.nextDouble();

        double media = (notas[0]+notas[1]+notas[2]+notas[3]) / 4;
        Array list- é uma classe, usada quando nao sabe o tamanho que vai usar, pode ir acrescentando

        ArrayList<Double> listaNotas = new ArrayList<>();
        listaNotas.add(10.0);
        System.out.println(listaNotas.get(0));**/
        // O que é uma Thread- é uma unidade de execução dentro de um processo;
        //- Um programa Java sempre tem pelo menos uma thread principal, que executa o método main().
        //- Podemos criar múltiplas threads para rodar tarefas simultaneamente, sem bloquear a execução do programa
    }
}
