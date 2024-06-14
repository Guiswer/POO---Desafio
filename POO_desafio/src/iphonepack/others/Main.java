package iphonepack.others;

import iphonepack.iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone celular = new Iphone();

        // Reprodutor Musical
        System.out.println("\n[Reprodutor Musical]");
        celular.tocar();
        celular.pausar();
        celular.selecionarMusica("Nothing else metters");

        // Aparelho Telefonico
        System.out.println("\n[Aparelho Telefonico]");
        celular.ligar("11988796033");
        celular.atender();
        celular.iniciarCorreioVoz();

        // Navegador Internet
        System.out.println("\n[Navegador Internet]");
        celular.exibirPagina("web.dio.me/home");
        celular.adicionarNovaAba();
        celular.atualizarPagina();
    }
}