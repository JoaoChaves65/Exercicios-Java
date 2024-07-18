package questao7;

public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentarVolume() {
        tv.aumentarVolume();
    }

    public void diminuirVolume() {
        tv.diminuirVolume();
    }

    public void aumentarCanal() {
        tv.aumentarCanal();
    }

    public void diminuirCanal() {
        tv.diminuirCanal();
    }

    public void mudarCanalIndicado(int novoCanal) {
        tv.mudarCanalIndicado(novoCanal);
    }

    public int consultarVolume() {
        return tv.getVolume();
    }

    public int consultarCanal() {
        return tv.getCanal();
    }


}
