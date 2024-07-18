package exercicio_complementar;

public class Calculadora {
    private float numero1;
    private float numero2;
    private float resultado;

    public Calculadora() {
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public float somar(float numero1, float numero2) {
        resultado = numero1 + numero2;
        return resultado;
    }

    public float dividir() {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            resultado = Float.NaN;
        }
        return resultado;
    }

    public float multiplicar(float numero1, float numero2) {
        resultado = numero1 * numero2;
        return resultado;
    }

    public float subtrair(float numero1, float numero2) {
        resultado = numero1 - numero2;
        return resultado;
    }
}
