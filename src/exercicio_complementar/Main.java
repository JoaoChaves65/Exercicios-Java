package exercicio_complementar;

public class Main {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        
        System.out.println("O resultado da soma é: " + c1.somar(2, 9));

        c1.setNumero1(10);
        c1.setNumero2(2);
        System.out.println("O resultado da divisão é: " + c1.dividir());

        System.out.println("O resultado da multiplicação é: " + c1.multiplicar(8, 5));

        System.out.println("O resultado da subtração é: " + c1.subtrair(14, 8));
    }
}
