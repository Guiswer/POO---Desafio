package iphonepack.iphone;

import iphonepack.interfaces.AparelhoTelefonico;
import iphonepack.interfaces.NavegadorInternet;
import iphonepack.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // ReprodutorMusical
    public void tocar() {
        System.out.println("Está tocando..");
    }

    public void pausar() {
        System.out.println("Música pausada!");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " foi selecionada!");
    }


    // AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo ligação..");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Inicializando o correio de voz..");
    }


    // NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Acessando a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba..");
    }

    public void atualizarPagina() {
        System.out.println("Recarregando página..");
    }
}