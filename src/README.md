# 🏦 ContaBanco - Desafio DIO

[![Java](https://img.shields.io/badge/Java-21+-orange.svg)](https://www.oracle.com/java/)
[![DIO](https://img.shields.io/badge/DIO-Trilha%20Java-blue.svg)](https://www.dio.me/)

Projeto desenvolvido como parte do desafio de **Sintaxe Java** da trilha Java Básico da [Digital Innovation One (DIO)](https://www.dio.me/).

## 📋 Sobre o Projeto

O **ContaBanco** é uma aplicação Java que simula a criação de uma conta bancária, coletando dados do usuário via terminal e exibindo uma mensagem de confirmação formatada.

### 🎯 Objetivos do Desafio

- Exercitar conceitos de **sintaxe Java**
- Praticar **declaração de variáveis**
- Utilizar a classe **Scanner** para entrada de dados
- Trabalhar com **formatação de strings**
- Implementar interação via **terminal**

## 💻 Funcionalidades

✅ Coleta de dados via terminal  
✅ Validação de tipos de dados  
✅ Formatação de valores monetários  
✅ Exibição de mensagem personalizada

## 🏗️ Estrutura do Projeto

## 📊 Atributos da Conta

| Atributo     | Tipo    | Exemplo      |
|--------------|---------|--------------|
| Numero       | Inteiro | 1021         |
| Agencia      | Texto   | 067-8        |
| Nome Cliente | Texto   | MARIO ANDRADE|
| Saldo        | Decimal | 237.48       |

## 🚀 Como Executar

### Pré-requisitos
- Java 21+ instalado
- Terminal/Prompt de comando

### Passos para execução

1. **Clone o repositório**
   bash git clone https://github.com/NickMorethes/ContaBanco.git
2. **Compile o programa**
   cd ContaBanco
   javac src/ContaTerminal.java
3. **Execute o programa**
   java -cp src ContaTerminal
4. **Siga as instruções no terminal**

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.

## 🛠️ Tecnologias Utilizadas

- **Java 21+**
- **Scanner** (entrada de dados)
- **System.out.printf** (formatação de saída)

## 📝 Conceitos Aplicados

- ✅ Declaração de variáveis com `var`
- ✅ Tipos primitivos (`int`, `double`) e `String`
- ✅ Entrada de dados via Scanner
- ✅ Formatação de strings com `printf`
- ✅ Tratamento de buffer do Scanner
- ✅ Boas práticas de nomenclatura

## 🔧 Observações Técnicas

### Uso da palavra-chave `var`
- Implementação moderna do Java com inferência de tipos
- Código mais limpo e legível
- Tipos deduzidos automaticamente pelo compilador

### Tratamento de Buffer
- Implementado `scanner.nextLine()` após `nextInt()` para limpar o buffer
- Evita problemas na captura de strings subsequentes

### Formatação de Saída
- Utilização de `System.out.printf()` com formatadores específicos:
    - `%s` para strings (nome e agência)
    - `%d` para números inteiros (conta)
    - `%.2f` para valores decimais com 2 casas (saldo)

## 👨‍💻 Autor

Desenvolvido como parte dos estudos na trilha **Java Básico** da DIO.

**Instrutor:** Gleyson Sampaio

## 📚 Aprendizados

Durante o desenvolvimento deste projeto, foram aplicados os seguintes conceitos:

- Sintaxe básica do Java
- Manipulação de entrada/saída
- Formatação de dados
- Tratamento de tipos de dados
- Interação com usuário via terminal
- Uso da inferência de tipos com `var`
- Gerenciamento de recursos com `scanner.close()`

## 🔍 Principais Desafios Enfrentados

- **Buffer do Scanner**: Tratamento adequado após `nextInt()`
- **Formatação de decimais**: Uso correto de `%.2f` para valores monetários
- **Inferência de tipos**: Uso apropriado da palavra-chave `var`
- **Gerenciamento de recursos**: Fechamento correto do Scanner

## 🤝 Contribuições

Este é um projeto de estudo, mas sugestões e melhorias são sempre bem-vindas!

### Como contribuir:
1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto é desenvolvido para fins educacionais como parte do bootcamp DIO e Santander Back-end em Java.

## 🔗 Links Úteis

- [Digital Innovation One](https://www.dio.me/)
- [Documentação Java 21](https://docs.oracle.com/en/java/javase/21/)
- [Scanner Class Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html)
- [Java 21 Release Notes](https://www.oracle.com/java/technologies/javase/21-relnote-issues.html)

---

⭐ **Deixe uma estrela se este projeto foi útil para você!**

📧 **Conecte-se comigo:** [LinkedIn](https://www.linkedin.com/in/nicolly-morethes-a20783143) | [GitHub](https://github.com/NickMorethes)

*Feito com ❤️ e muito ☕ durante os estudos na DIO*