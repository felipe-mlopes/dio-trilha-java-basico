## Diagrama UML

Segue o diagrama UML do Desafio POO - IPhone

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +adicionarNovaAba()
        +atualizarPagina()
        +exibirPagina(String url)
    }

    class NavegadorInternet {
        +atender()
        +iniciarCorreioVoz()
        +ligar(String numero)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
