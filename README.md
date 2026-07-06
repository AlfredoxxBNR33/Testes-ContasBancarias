# Testes-ContasBancarias

## Sobre o Projeto
Este é um projeto acadêmico desenvolvido em Java para a disciplina de testes de software. O foco principal do repositório é a validação de regras de negócio de um sistema bancário através de testes unitários automatizados, utilizando o framework JUnit.

## Estrutura do Sistema
O sistema foi arquitetado utilizando os princípios da orientação a objetos e está dividido nos seguintes pacotes centrais:

- **Cliente:** Responsável pela representação dos titulares do banco.
- **Contas:** Contém a estrutura principal com a classe `ContaBancaria` e suas especializações com comportamentos distintos: `ContaCorrente` e `ContaPoupanca`.
- **Exceptions:** Concentra os tratamentos de erros customizados da aplicação, como a interrupção de operações financeiras através da `SaldoInsuficienteException`.
- **Testes:** O coração do projeto. Contém as classes `ContaCorrenteTest` e `ContaPoupancaTest`, estruturadas com os padrões de Preparação, Ação e Verificação (AAA) para cobrir caminhos felizes, exceções e limites de valores.

## Tecnologias e Ferramentas
- Java
- JUnit 5 (Testes Unitários)

## Como Executar
1. Faça o clone deste repositório em sua máquina local.
2. Abra a pasta do projeto em sua IDE (como VS Code ou Eclipse).
3. Aguarde a sincronização das dependências do ambiente.
4. Navegue até o pacote `src/Testes` e execute as classes de teste para acompanhar os resultados das validações no terminal.
