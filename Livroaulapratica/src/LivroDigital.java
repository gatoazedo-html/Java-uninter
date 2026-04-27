public class LivroDigital extends Livro {
    private int download;
    private double tamanho;


    public LivroDigital(String titulo, Autor autor, String genero, int edicao, double tamanho, int download) {
        super(titulo, autor, genero, edicao);
        this.tamanho = tamanho;
        this.download = download;
    }

    public LivroDigital() {}

    public int getDownload() {
        return download;
    }
    public void setDownload(int download) {
        this.download = download;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Download: " + this.download);
    }
}
