# API Restful - Sistema de Estoque & PDV (Projeto Final SENAI)

API backend robusta desenvolvida do zero em Java com Spring Boot como projeto final do curso técnico de 180 horas do SENAI. O sistema gerencia o fluxo completo de controle de estoque e ponto de venda (PDV), garantindo integridade de dados, regras de negócio estruturadas e segurança.

## 🚀 Sobre o Projeto
Este projeto foi construído para simular um cenário real de mercado para automação comercial. A API gerencia produtos, categorias, controle de entradas/saídas de estoque e o processamento de vendas (PDV), servindo como a espinha dorsal de um sistema comercial completo.

## 🛠️ Tecnologias e Ferramentas Utilizadas
* **Java (JDK 17+)**
* **Spring Boot** (Spring Web, Spring Data JPA)
* **Banco de Dados Relacional** (PostgreSQL / MySQL)
* **Hibernate / JPA** (Mapeamento objeto-relacional)
* **Maven** (Gerenciamento de dependências)
* **Bean Validation** (Validação de dados de entrada)

## ✨ Principais Funcionalidades da API
* **Gestão de Produtos:** Cadastro, atualização, consulta e controle de preços e SKUs.
* **Controle de Estoque:** Atualização automática de saldo de estoque a cada venda realizada ou entrada de mercadoria.
* **Módulo PDV (Ponto de Venda):** Registro de transações de venda, cálculo de totais e associação com itens.
* **Tratamento de Exceções:** Retornos de erros padronizados e amigáveis para o cliente da API.

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* Maven configurado.
* Um banco de dados relacional rodando localmente.

### Passo a passo
1. Clone este repositório:
   ```bash
   git clone [https://github.com/fernandofoeppel/EstoquePDV.git](https://github.com/fernandofoeppel/EstoquePDV.git)
