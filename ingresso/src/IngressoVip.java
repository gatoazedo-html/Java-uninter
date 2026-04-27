public class IngressoVip extends Ingresso {
    public double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("valor adicional: " + adicional);
        System.out.println("total do ingresso: " +(valor+adicional));
        System.out.println();
    }
}
