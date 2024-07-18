package questao6;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Vingadores: Ultimato", "lançamento");
        System.out.println("Preço da locação para " + filme1.titulo + ": R$ " + String.format("%.2f", filme1.calcularPrecoLocacao()));

        Filme filme2 = new Filme("Toy Story 4", "infantil");
        System.out.println("Preço da locação para " + filme2.titulo + ": R$ " + String.format("%.2f", filme2.calcularPrecoLocacao()));
    }
}
