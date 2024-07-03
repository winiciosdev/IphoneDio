package com.lucas.IphoneDio;

import java.util.Scanner;
public class iphoneBase{
private Scanner l = new Scanner(System.in);
  //implementação dos metodos da interface ReprodutorMusica
  public void tocar(){
    System.out.println("tocando música");
  }

  public void pausar(){
    System.out.println("Musica pausada");
  }

  public void selecionarMusica(String musica){
    System.out.println("Escreva a música que você deseja tocar");
    String LMusica = l.nextLine();
    System.out.println("Música " + LMusica + " selecionada!");
  }

  // implementação dos metodos da interface NavegadorInternet

  public void exibirPagina(String url){
    System.out.println("Escreva a url que você deseja acessar");
    String LUrl = l.nextLine();
    System.out.println("Exibindo pagina " + LUrl );
  }

  public void pesquisar(String nomePesquisa){
    System.out.println("Escreva o que você deseja pesquisar");
    String LNomePesquisa = l.nextLine();
    System.out.println("Pesquisando " + LNomePesquisa);
  }


  public void atualizarPagina(){
    System.out.println("Atualizando pagina...");
    System.out.println("Pagina atualizada!");
  }
 // implementando metodos da interface AparelhoTelefonico

public void ligar(String numero){
  System.out.println("digite o número para qual você deseja ligar");
  String LNumero = l.nextLine();
  System.out.println("Ligando para " + LNumero);
}

  public void atender(){
    System.out.println(" Atendendo... ");
  }

  public void correioDeVoz(){
    System.out.println("Enviando mensagem para o correio de voz");
  }
  
  
  }
