import java.util.Random;

public class Produto {
    public String nomeProduto;
    public int codigoProduto;
    public double valorProduto;
    public String categoriaProduto ;

    public Produto(){
        this.codigoProduto = new Random().nextInt(1000,10000);
        this.nomeProduto = "Agua mineral da fonte";
        this.valorProduto = 3.50;
        this.categoriaProduto = "bebidas";

    }
    public void mostrarDadosProdutos(){
        System.out.println("Nome do produto:"+this.nomeProduto);
        System.out.println("Código do produto:"+this.codigoProduto);
        System.out.println("Valor do produto: R$"+this.valorProduto);
        System.out.println("Categoria do produto:"+this.categoriaProduto);
    }
}
