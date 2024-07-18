package questao7;

public class Main {
    public static void main(String[] args) {
        Televisao minhaTV = new Televisao();
        ControleRemoto controle = new ControleRemoto(minhaTV);

        controle.aumentarVolume();
        controle.aumentarCanal();
        controle.mudarCanalIndicado(5);

        System.out.println("Volume: " + controle.consultarVolume());
        System.out.println("Canal: " + controle.consultarCanal());
    }
}
