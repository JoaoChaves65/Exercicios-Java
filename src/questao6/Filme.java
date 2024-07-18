package questao6;

class Filme {
    String titulo;
    String categoria;

    Filme(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    double calcularPrecoLocacao() {
    double valorBase = 4.00;

    switch (categoria) {
        case "infantil":
            return valorBase + 2.00;
        case "lançamento":
            return valorBase + 3.00;
        case "promoção":
            return valorBase - 2.00;
        default:
            return valorBase;
    }
}


}
