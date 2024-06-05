package entities;

public interface NavegadorInternet {
    default void exibirPagina(){
        System.out.println("EXIBINDO PAGINA");
    }
    default void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }
    default void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }
}
