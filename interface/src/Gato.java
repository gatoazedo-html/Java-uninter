public class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("miau!");

    }

    @Override
    public void dormir() {
        System.out.println("zzz");
    }
}
