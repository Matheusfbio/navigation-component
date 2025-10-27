# Projeto de Demonstração do Navigation Component

Este projeto é um exemplo prático de como utilizar o **Android Navigation Component** para criar um fluxo de cadastro de usuário em várias etapas, seguindo a arquitetura de Single-Activity.

## Objetivo do Projeto

O objetivo é demonstrar como estruturar um aplicativo que coleta informações do usuário de forma sequencial, navegando entre diferentes telas (Fragmentos), passando dados entre elas de forma segura com Safe Args, e exibindo um resumo final de todas as informações coletadas.

## Tecnologias e Conceitos Utilizados

-   **Single-Activity Architecture**: O app utiliza uma `MainActivity` que hospeda um `NavHostFragment`. Todos os fluxos de tela são gerenciados como Fragmentos.

-   **Navigation Component**: A principal biblioteca utilizada para gerenciar a navegação.
    -   **Gráfico de Navegação (`nav_graph.xml`)**: Define todos os destinos (Fragmentos) e as ações (transições) entre eles.
    -   **Safe Args**: Utilizado para gerar classes de navegação e argumentos de forma type-safe, garantindo a passagem de dados correta entre os Fragmentos.

-   **View Binding**: Habilitado no projeto para fornecer acesso seguro e type-safe às views dos layouts XML, eliminando a necessidade de `findViewById`.

-   **Kotlin-Parcelize**: Para serializar objetos de dados (data classes) e passá-los através dos argumentos de navegação.

-   **Material Design Components**: A interface do usuário é construída com componentes modernos do Material Design.

## Estrutura do Projeto

-   `MainActivity.kt`: A única Activity do app, responsável por configurar o `NavHostFragment`.

-   `res/navigation/nav_graph.xml`: O coração da navegação. Define o fluxo completo: `PersonalDataFragment` -> `AddressFragment` -> `ResumeFragment`.

-   `fragments/PersonalDataFragment.kt`: Primeira etapa do formulário, onde o usuário insere nome e idade.

-   `fragments/AddressFragment.kt`: Segunda etapa, onde o usuário insere rua e número.

-   `fragments/ResumeFragment.kt`: Tela final que exibe um resumo de todos os dados coletados (nome, idade, rua e número).

-   `model/`: Contém as `data classes` `Parcelable` (`PersonModel`, `AddressModel`, `ResumeModel`) usadas para encapsular e transportar os dados do usuário através do Safe Args.

## Próximos Passos

O projeto agora tem um fluxo funcional completo. Possíveis melhorias futuras incluem:

-   Adicionar validação de entrada em tempo real nos campos de texto.
-   Implementar um botão "Finalizar" ou "Voltar ao Início" no `ResumeFragment`.
-   Melhorar a interface do usuário (UI/UX) com animações de transição entre os fragmentos.
-   Adicionar testes unitários e de instrumentação para validar a lógica de navegação e de negócios.
