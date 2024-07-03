# Projeto IphoneDio

Este projeto é uma implementação das funcionalidades de um iPhone, incluindo Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusica {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class IphoneBase {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class Iphone {
    }

    IphoneBase <|-- Iphone
    IphoneBase <|-- ReprodutorMusica
    IphoneBase <|-- AparelhoTelefonico
    IphoneBase <|-- NavegadorInternet
