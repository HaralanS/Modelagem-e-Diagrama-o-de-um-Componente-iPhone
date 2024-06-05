package entities;

public interface AparelhoTelefonico {
    default void ligar(){
        System.out.println("LIGANDO");
    }
    default void atender(){
        System.out.println("ATENDENDO");
    }
    default void iniciarCorreioDeVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
