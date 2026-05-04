enum Estacao {
    VERAO,
    OUTONO,
    INVERNO,
    PRIMAVERA
}

enum Medida {
    P,
    M,
    G,
    GG
}

public class Roupa {
    String modelo;
    Medida tamanho;
    Estacao colecao;

    public Roupa (String modelo, Medida tamanho, Estacao colecao) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.colecao = colecao;
    }

    public void msg() {
        switch (colecao) {
            case VERAO:
                System.out.println("Arrase na praia!");
                break;
            case OUTONO:
                System.out.println("Passe o outono com elegancia");
                break;
            case INVERNO:
                System.out.println("Se agasalhe bem e com estilo!");
                break;
            case PRIMAVERA:
                System.out.println("Se vista bem na estação das flores!");
                break;
            default:
                System.out.println("Erro");

        }
    }

}
