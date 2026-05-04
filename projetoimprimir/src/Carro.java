public class Carro implements Imprimivel {
    int portas;
    String marca;
    String cor;

    public Carro(int portas, String marca, String cor) {
        this.portas = portas;
        this.marca = marca;
        this.cor = cor;
    }


    @Override
    public void imprimir() {
        System.out.println("Carro");
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Portas: " + portas);
        System.out.println("-----------");
    }
}
