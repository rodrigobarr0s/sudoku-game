# Sudoku - Projeto em Java

Este projeto implementa um jogo de **Sudoku** em Java, com uma interface gráfica que facilita a interação do usuário. O jogo permite que o jogador preencha o tabuleiro, verifique o status do jogo, finalize o jogo ou reinicie o jogo a qualquer momento.

## Funcionalidades

- **Jogar Sudoku**: Permite que o jogador preencha o tabuleiro com números.
- **Verificar Status do Jogo**: Exibe o status atual do jogo (não iniciado, incompleto ou completo) e se o jogo contém erros.
- **Finalizar o Jogo**: O jogador pode finalizar o jogo. Se o jogo estiver completo e correto, uma mensagem de congratulações será exibida.
- **Reiniciar o Jogo**: O jogador pode reiniciar o jogo, apagando todos os valores preenchidos no tabuleiro.
- **Células Fixas e Modificáveis**: Algumas células no tabuleiro são fixas (não podem ser modificadas), enquanto outras são modificáveis pelo jogador.

## Tecnologias Utilizadas

- **Java**: A linguagem principal para a implementação.
- **Swing**: Usado para criar a interface gráfica (GUI) do jogo.
- **Design Patterns**: Padrões de design como Observer para notificar as mudanças e MVC (Model-View-Controller).

## Estrutura do Projeto

```
├── br
│   └── com
│       └── sudoku
│           ├── application
│           │   └── AppSudoku.java
│           ├── controller
│           │   ├── GameController.java
│           │   └── SudokuController.java
│           ├── model
│           │   ├── entities
│           │   │   ├── Space.java
│           │   │   ├── Board.java
│           │   │   └── GameStatus.java
│           │   ├── exceptions
│           │   │   ├── InvalidMoveException.java
│           │   │   └── BoardNotValidException.java
│           │   ├── services
│           │   │   ├── BoardService.java
│           │   │   ├── NotifierService.java
│           │   │   └── SudokuValidatorService.java
│           │   └── utils
│           │       ├── BoardTemplate.java
│           │       └── SudokuHelper.java
│           ├── ui
│           │   ├── custom
│           │   │   ├── button
│           │   │   │   ├── CheckGameStatusButton.java
│           │   │   │   ├── FinishGameButton.java
│           │   │   │   └── ResetButton.java
│           │   │   ├── input
│           │   │   │   └── NumberText.java
│           │   │   ├── panel
│           │   │   │   ├── MainPanel.java
│           │   │   │   └── SudokuSector.java
│           │   │   └── screen
│           │   │       └── MainScreen.java
│           └── resources
│               └── config
│                   └── gameConfig.properties
```

### Descrição dos Pacotes e Classes

- **`application`**: Contém a classe principal para inicializar o jogo e a interface gráfica.
    - **`MainScreen.java`**: Cria e exibe a interface gráfica do jogo.

- **`controller`**: Pacote que contém as classes que gerenciam as interações entre o usuário e o jogo.
    - **`GameController.java`**: Controla o andamento do jogo, gerencia os movimentos dos jogadores e o fluxo das ações.
    - **`SudokuController.java`**: Gerencia o estado do tabuleiro e valida as jogadas.

- **`model`**: Contém as entidades, serviços e exceções para a lógica central do jogo.
    - **`entities`**: Contém as entidades principais do jogo, como as células e o tabuleiro.
        - **`Space.java`**: Representa uma célula do tabuleiro, incluindo seu valor e se é fixo ou editável.
        - **`Board.java`**: Representa o tabuleiro completo de Sudoku, com as células e a lógica de manipulação.
        - **`GameStatus.java`**: Enum que define os diferentes status do jogo (não iniciado, incompleto, completo).
    - **`exceptions`**: Exceções específicas do jogo.
        - **`InvalidMoveException.java`**: Lançada quando um movimento inválido é feito.
        - **`BoardNotValidException.java`**: Lançada quando o tabuleiro não é válido.
    - **`services`**: Contém os serviços de lógica de negócios e validação.
        - **`BoardService.java`**: Gerencia a validação do tabuleiro e controle de progresso do jogo.
        - **`NotifierService.java`**: Notifica alterações no status do jogo e alerta o usuário.
        - **`SudokuValidatorService.java`**: Serviço para validar se o tabuleiro está correto.
    - **`utils`**: Utilitários para auxiliar na implementação do jogo.
        - **`BoardTemplate.java`**: Define o modelo visual do tabuleiro.
        - **`SudokuHelper.java`**: Funções auxiliares para manipulação de dados no tabuleiro.

- **`ui`**: Contém a interface gráfica do usuário (GUI), composta por componentes gráficos como botões, painéis, campos de entrada, etc.
    - **`custom`**: Pacote com a personalização dos componentes gráficos.
        - **`button`**: Botões personalizados para interagir com o jogo (Verificar Status, Finalizar, Resetar).
        - **`input`**: Componentes de entrada personalizados para os números do Sudoku.
        - **`panel`**: Painéis que organizam e exibem as células do tabuleiro.
        - **`screen`**: Classe que monta a tela principal do jogo.
    - **`MainPanel.java`**: O painel principal onde o jogo é exibido.
    - **`SudokuSector.java`**: Responsável por exibir os setores 3x3 do tabuleiro.

- **`resources/config`**: Contém arquivos de configuração do jogo.
    - **`gameConfig.properties`**: Arquivo de configuração com dados iniciais e regras do jogo.

---

## Como Rodar o Projeto

### Pré-requisitos

- **Java 8 ou superior** instalado.
- **IDE de desenvolvimento** como IntelliJ IDEA, Eclipse, ou outra de sua preferência, para importar o projeto e executá-lo.
- Se for usar pela linha de comando, certifique-se de ter o JDK configurado corretamente.

### Passos para executar

1. Clone ou faça o download deste repositório.
2. Abra o projeto em sua IDE favorita ou na linha de comando.
3. Execute a classe `AppSudoku` para iniciar o jogo.

### Como Passar a Configuração do Jogo

Você pode passar uma configuração personalizada para o jogo através de uma string de argumentos no seguinte formato:

```
0,0;4,false 1,0;7,false 2,0;9,true 3,0;5,false 4,0;8,true 5,0;6,true 6,0;2,true 7,0;3,false 8,0;1,false 0,1;1,false 1,1;3,true 2,1;5,false 3,1;4,false 4,1;7,true 5,1;2,false 6,1;8,false 7,1;9,true 8,1;6,true 0,2;2,false 1,2;6,true 2,2;8,false 3,2;9,false 4,2;1,true 5,2;3,false 6,2;7,false 7,2;4,false 8,2;5,true 0,3;5,true 1,3;1,false 2,3;3,true 3,3;7,false 4,3;6,false 5,3;4,false 6,3;9,false 7,3;8,true 8,3;2,false 0,4;8,false 1,4;9,true 2,4;7,false 3,4;1,true 4,4;2,true 5,4;5,true 6,4;3,false 7,4;6,true 8,4;4,false 0,5;6,false 1,5;4,true 2,5;2,false 3,5;3,false 4,5;9,false 5,5;8,false 6,5;1,true 7,5;5,false 8,5;7,true 0,6;7,true 1,6;5,false 2,6;4,false 3,6;2,false 4,6;3,true 5,6;9,false 6,6;6,false 7,6;1,true 8,6;8,false 0,7;9,true 1,7;8,true 2,7;1,false 3,7;6,false 4,7;4,true 5,7;7,false 6,7;5,false 7,7;2,true 8,7;3,false 0,8;3,false 1,8;2,false 2,8;6,true 3,8;8,true 4,8;5,true 5,8;1,false 6,8;4,true 7,8;7,false 8,8;9,false
```

### Exemplo de Execução:

![Sudoku Game Screenshot](https://github.com/rodrigobarr0s/sudoku-game/blob/main/assets/sudoku.png)

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções ou novas funcionalidades! Basta fazer um fork deste repositório, criar uma branch com suas modificações e enviar um pull request.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.