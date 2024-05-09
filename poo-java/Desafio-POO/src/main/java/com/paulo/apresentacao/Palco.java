package com.paulo.apresentacao;

import com.paulo.iphone.Iphone;

public class Palco {
    public static void main(String[] args) {
        System.out.println("No evento de lançamento do iPhone em 2007, Steve Jobs começou sua apresentação com as seguintes palavras:\n" +
                "\n" +
                "\"Estamos revolucionando o mercado de telefones celulares hoje. E vamos começar com um dispositivo revolucionário. Hoje, a Apple reinventará o telefone.\"");

        Iphone iphone = new Iphone();

        // Demonstração do uso do navegador
        System.out.println("\n\nVamos começar revolucionando a navegação na internet!");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Demonstração do uso do reprodutor musical
        System.out.println("\n\nAgora, vamos revolucionar a maneira como ouvimos música!");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        // Demonstração do uso do telefone
        System.out.println("\n\nPor fim, vamos reinventar a forma como nos comunicamos!");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

    }
}
