import java.util.Random;

public class Bola {
    public int NumSerie;
    public String material;
    public Double raio;
    public String cor;

    public Bola(){
        this.NumSerie = new Random().nextInt(1000,10000);
        this.material = "Uretano";

    }
    public void mostrarDados(){
        System.out.println("Numero de serie:"+this.NumSerie);
        System.out.println("Material:"+this.material);
        System.out.println("Raio:"+this.raio);
        System.out.println("Cor:"+this.cor);
    }
}
