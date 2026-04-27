public class LivroFisico extends Livro {
    private int tiragem;
    private int peso;

    public LivroFisico(String titulo, Autor autor, String genero, int edicao, int peso, int tiragem) {
        super(titulo, autor, genero, edicao);
        this.peso = peso;
        this.tiragem = tiragem;
    }

    public LivroFisico() {}

    public int getTiragem() {
        return tiragem;
    }
    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override //segurança para nao errar
    public void info() {
        super.info();
        System.out.println("Tiragem: " + this.tiragem);
        System.out.println("Peso: " + this.peso);
    }
}
