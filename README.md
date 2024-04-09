## Descrição do Projeto

O projeto "Desafio de Conta Bancária" é um programa em Java desenvolvido como parte de um desafio de programação. Originalmente criado pela talentosa instrutora da Alura, [Jacqueline Oliveira](https://github.com/jacqueline-oliveira), o programa simula as operações básicas de uma conta bancária, incluindo consulta de saldo, transferência de valores e recebimento de valores. O programa oferece uma interface simples e intuitiva, com um menu interativo que guia o usuário através das diferentes opções disponíveis. Posteriormente, foram realizadas melhorias no código para aprimorar a legibilidade do menu e a robustez da entrada de dados. Estas melhorias foram implementadas para garantir uma experiência de usuário mais agradável e confiável.

## Funcionalidades

- Consultar saldo
- Transferir valor
- Receber valor
- Sair

## Melhorias Implementadas

1. **Limpeza no Menu**
   - Removidos espaços e quebras de linha desnecessários na string do menu, melhorando a legibilidade.

2. **Tratamento de Erros na Entrada do Usuário**
   - Adicionado verificação para garantir que as entradas do usuário sejam válidas antes de prosseguir.
   - Utilização de `hasNextInt()` e `hasNextDouble()` para prevenir exceções ao receber entradas inválidas.
   - Limpeza do buffer do scanner (`leitura.next();`) em caso de entrada inválida.
  
---

Este projeto foi desenvolvido como parte do desafio proposto pela Alura + Oracle. Sinta-se à vontade para explorar, testar e contribuir com o código!


