# Desafio Conta Bancaria
 O projeto "Desafio de Conta Bancária" é um programa em Java desenvolvido para simular as operações básicas de uma conta bancária. Criado como parte de um desafio de programação, este programa permite que o usuário consulte o saldo atual da conta, realize transferências de valores para outras contas e receba valores em sua conta.
 O programa oferece uma interface simples e intuitiva, com um menu interativo que guia o usuário através das diferentes opções disponíveis. As melhorias recentemente implementadas focam na legibilidade do menu e na robustez da entrada de dados, garantindo uma experiência de usuário mais agradável e confiável.

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


