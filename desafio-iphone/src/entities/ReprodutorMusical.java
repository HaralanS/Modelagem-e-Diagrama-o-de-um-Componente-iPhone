package entities;

public interface ReprodutorMusical {
    default void tocarMusica(){
        System.out.println("TOCANDO MUSICA");
    }
    default void pausarMusica(){
        System.out.println("PAUSANDO MUSICA");
    }
    default void selecionarMusica(){
        System.out.println("SELECIONANDO MUSICA");
    }
}
