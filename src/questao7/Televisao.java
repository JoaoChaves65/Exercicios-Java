package questao7;

public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 0;
        this.canal = 1;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
        }
    }

    public void mudarCanalIndicado(int novoCanal) {
        if (novoCanal >= 1) {
            canal = novoCanal;
        }
    }
}

