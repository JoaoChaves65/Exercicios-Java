package questao9;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantidadePessoas;

    public Elevador() {
        
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }
    
    public void entrar() {
        if (quantidadePessoas < capacidade) {
            quantidadePessoas++;
            System.out.println("Uma pessoa entrou no elevador. Quantidade atual: " + quantidadePessoas);
        } else {
            System.out.println("Elevador já está na capacidade máxima. Não é possível entrar mais pessoas.");
        }
    }

    public void sair() {
        if (quantidadePessoas > 0) {
            quantidadePessoas--;
            System.out.println("Uma pessoa saiu do elevador. Quantidade atual: " + quantidadePessoas);
        } else {
            System.out.println("Elevador já está vazio. Não há pessoas para sair.");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Elevador subiu para o andar: " + andarAtual);
        } else {
            System.out.println("Elevador já está no último andar. Não é possível subir mais.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Elevador desceu para o andar: " + andarAtual);
        } else {
            System.out.println("Elevador já está no térreo. Não é possível descer mais.");
        }
    }

    public void imprimirEstadoElevador() {
        System.out.println("Andar atual: " + getAndarAtual());
        System.out.println("Total de andares: " + getTotalAndares());
        System.out.println("Capacidade do elevador: " + getCapacidade());
        System.out.println("Quantidade de pessoas: " + getQuantidadePessoas());
        System.out.println("--------------------------");
    }
}
