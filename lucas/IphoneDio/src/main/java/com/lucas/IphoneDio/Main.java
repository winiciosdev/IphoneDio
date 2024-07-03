package com.lucas.IphoneDio;

public class Main {
  public static void main(String[] args) {

  iphone iphone1 = new iphone();

    //testando os metodos da interface ReprodutorMusica
    iphone1.tocar();
    iphone1.pausar();
    iphone1.selecionarMusica("Musica");

    //testando os metodos da interface NavegadorInternet
    iphone1.exibirPagina("url");
    iphone1.pesquisar("nomePesquisa");
    iphone1.atualizarPagina();

    //testando os metodos da interface AparelhoTelefonico
    iphone1.ligar("numero");
    iphone1.atender();
    iphone1.correioDeVoz();
  }
}