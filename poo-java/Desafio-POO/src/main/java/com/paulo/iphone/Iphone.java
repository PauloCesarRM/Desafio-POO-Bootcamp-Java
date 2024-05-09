package com.paulo.iphone;

import com.paulo.interfaces.Navegador;
import com.paulo.interfaces.PlayerMusical;
import com.paulo.interfaces.Telefone;

public class Iphone implements Navegador, PlayerMusical, Telefone {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página inicial Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");

    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausou a música");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");

    }

    @Override
    public void ligar() {
        System.out.println("Realizando ligação...");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação: \n Alô!");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");

    }
}
