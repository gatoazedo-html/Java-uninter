//import java.util.ArrayList;
void main() {
    Desktop compA = new Desktop(8,4,600);
    Notebook compB = new Notebook(8,4,15);

    ArrayList<Computador> listaComputadores = new ArrayList<>();
    listaComputadores.add(compA);
    listaComputadores.add(compB);
    listaComputadores.add(new Desktop(16,8,1200));
    listaComputadores.add(new Notebook(16,8,18));

    double total = 0;
    for (Computador c : listaComputadores) {
        total += c.calcularValor();
    }
    System.out.println("total: " +total);


    /*
    Computador comp; //polimorfismo
    comp = compA;
    System.out.println("Valor: " + comp.calcularValor());
    comp = compB;
    System.out.println("Valor: " + comp.calcularValor());
     */
}