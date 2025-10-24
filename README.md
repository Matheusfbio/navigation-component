# Projeto de Demonstração do Navigation Component

Este projeto é um exemplo prático de como utilizar o **Android Navigation Component** para criar um fluxo de cadastro de usuário em várias etapas, seguindo a arquitetura de Single-Activity (uma única Activity que gerencia múltiplos Fragmentos).

## Objetivo do Projeto

O objetivo é demonstrar como estruturar um aplicativo que coleta informações do usuário de forma sequencial, navegando entre diferentes telas (Fragmentos) e passando dados entre elas.

Até o momento, o projeto implementa as seguintes funcionalidades:

1.  **Tela de Dados Pessoais (`PersonalDataFragment`)**: Onde o usuário insere seu nome e idade.
2.  **Tela de Endereço (`AddressFragment`)**: Onde o usuário insere sua rua e número.

## Tecnologias e Conceitos Utilizados

-   **Single-Activity Architecture**: O app utiliza uma `MainActivity` que hospeda um `NavHostFragment`. Todos os fluxos de tela são gerenciados como Fragmentos dentro deste host.

-   **Navigation Component**: A principal biblioteca utilizada para gerenciar a navegação.
    -   **Gráfico de Navegação (`nav_graph.xml`)**: Define todos os destinos (Fragmentos) e as ações (transições) entre eles de forma visual e centralizada.

-   **View Binding**: Habilitado no projeto para fornecer acesso seguro e type-safe às views dos layouts XML, eliminando a necessidade de `findViewById`.

-   **Material Design Components**: A interface do usuário é construída com componentes modernos do Material Design, como:
    -   `com.google.android.material.textfield.TextInputLayout`: Para criar campos de entrada de texto robustos e acessíveis.
    -   `com.google.android.material.button.MaterialButton`: O botão padrão para ações no app.

## Estrutura do Projeto (Até Agora)

-   `MainActivity.kt`: A única Activity do app, responsável por configurar o `NavHostFragment` e a barra de navegação superior (Toolbar).

-   `res/navigation/nav_graph.xml`: O coração da navegação. Atualmente, define `PersonalDataFragment` como o destino inicial e uma ação para navegar até `AddressFragment`.

-   `PersonalDataFragment.kt` e `layout/fragment_personal_data.xml`: A primeira etapa do formulário.

-   `AddressFragment.kt` e `layout/fragment_address.xml`: A segunda etapa do formulário.

-   `model/PersonModel.kt`: Um `Parcelable` data class criado para encapsular os dados do usuário e passá-los de forma segura entre os Fragmentos.

## Próximos Passos

O projeto está preparado para a implementação da lógica de validação de dados nos Fragmentos e a passagem do objeto `PersonModel` entre `PersonalDataFragment` e `AddressFragment`.
