void main() {
    Funcionario f = new Funcionario("Mario", "111.222.333-4");
    Carro c = new Carro(4, "Palio", "Cinza");
    Quadrado q = new Quadrado(10);



    ArrayList<Imprimivel> lista = new ArrayList<>();
    lista.add(f);
    lista.add(c);
    lista.add(q);

    for (Imprimivel imp : lista) {
        imp.imprimir();
    }
}