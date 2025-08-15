# Projeto Sistema de Vendas em Java

Bem-vindo ao projeto de um sistema de vendas simples, desenvolvido em Java. Este projeto foi criado para demonstrar os princípios da **Programação Orientada a Objetos (POO)** e, principalmente, a implementação de **Testes de Unidade** com frameworks padrão do mercado.

---

## 📖 Sobre o Projeto

Este sistema simula um processo de vendas básico, onde um `Cliente` pode adicionar `Produto`s a um `CarrinhoDeCompras` e realizar uma `Compra`. O projeto inclui a gestão de `Estoque` e o registro de `Fornecedor`es, com o principal foco na qualidade do código e na sua testabilidade.

A classe `CarrinhoDeCompras` é um exemplo claro de um componente com lógica de negócios, e seu comportamento é garantido por testes de unidade robustos, utilizando **JUnit** para as asserções e **Mockito** para a criação de objetos simulados (mocks).

### Funcionalidades Principais

* **POO:** Classes bem definidas (`Produto`, `CarrinhoDeCompras`, `Estoque`, etc.) com encapsulamento e responsabilidades claras.
* **Lógica de Negócios:** Funções para adicionar e remover produtos, calcular o total da compra e gerenciar o estoque.
* **Testes de Unidade:** Cobertura de testes abrangente para as principais classes, garantindo o comportamento esperado da aplicação.
* **Mocks:** Uso de Mockito para isolar a classe `CarrinhoDeCompras` de suas dependências (`Produto`), permitindo testes mais eficazes.

---

## 🚀 Tecnologias Utilizadas

* **Java:** Linguagem de programação.
* **JUnit 5:** Framework para escrita e execução de testes de unidade.
* **Mockito:** Framework para criação de mocks e stubs, facilitando o isolamento dos testes.
* **Maven:** (Implícito) Ferramenta de build e gerenciamento de dependências, comumente usada em projetos Java.

---

## ⚙️ Como Rodar a Aplicação

Siga os passos abaixo para compilar e executar o projeto:

1.  **Pré-requisitos:** Certifique-se de ter o **JDK** (Java Development Kit) instalado em sua máquina e uma ferramenta de build como o **Maven**.
2.  **Clone o repositório:**
    ```bash
    git clone [URL_DO_SEU_REPOSITORIO]
    cd [NOME_DO_SEU_PROJETO]
    ```
3.  **Compilar e Empacotar o Projeto:**
    ```bash
    mvn clean package
    ```
4.  **Executar os Testes de Unidade:**
    ```bash
    mvn test
    ```
    O comando acima executará todos os testes do projeto, incluindo os de `CarrinhoDeComprasTest`, e mostrará os resultados no console.

---

## 📂 Estrutura do Projeto

* `src/main/java/classes/`: Contém as classes principais do sistema (`CarrinhoDeCompras`, `Compra`, `Estoque`, `Fornecedor`, `Produto`).
* `src/test/java/testes/`: Contém as classes de testes de unidade, usando JUnit e Mockito para garantir a funcionalidade de cada componente.

---