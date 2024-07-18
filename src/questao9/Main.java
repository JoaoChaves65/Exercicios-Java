package questao9;

public class Main {

    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializar(8, 10);

        System.out.println("Estado inicial do elevador:");
        elevador.imprimirEstadoElevador();

        elevador.entrar(); 
        elevador.subir(); 
        elevador.entrar(); 
        elevador.entrar(); 
        elevador.subir(); 
        elevador.subir(); 
        elevador.sair(); 
        elevador.subir(); 
        elevador.subir(); 
        elevador.subir(); 
        elevador.entrar(); 
        elevador.sair(); 

        System.out.println("\nEstado atual do elevador:");
        elevador.imprimirEstadoElevador();
    }
}
