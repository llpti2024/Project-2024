This is a project I developed as part of my learning and practice in Java programming. It is a simple console application that combines a user registration system with basic banking functionalities. Although it is a study project, I aimed to apply good practices and organize the code in a clear and functional manner.

Feature
User Registration
Users can register by providing their full name and CPF.
After registration, the system automatically generates a unique account number for each user.
The information is stored in a HashMap<Integer, Pessoa>, where the account number is used as the key to facilitate lookup.

Bank Access
To access the banking system, the user must provide their account number.
If the account number is not found:
The system offers the option to register or exit the application.
Banking Operations

In the bank menu, the user can perform the following operations:

Deposit
Allows the user to add a value to their account balance.

Withdraw
Allows the user to withdraw a value from their account balance, provided there is sufficient balance.
If there is insufficient balance, the system displays an error message.

Check Balance
Displays the current account balance.

Validations and Flow Control
The system uses validations with if-else to:
Confirm if the account number is registered.
Ensure that the withdrawal does not exceed the available balance.
Interactive menus are created using switch, making navigation more intuitive.

_____________________________________________________________________________________________________________________


Este é um projeto que desenvolvi como parte do meu aprendizado e prática de programação em Java. Ele é um aplicativo simples de console que combina um sistema de cadastro de usuários com funcionalidades básicas de operações bancárias. Apesar de ser um projeto de estudo, busquei aplicar boas práticas e organizar o código de forma clara e funcional.

Funcionalidades
Cadastro de Usuários
Os usuários podem se cadastrar informando nome completo e CPF.
Após o cadastro, o sistema gera automaticamente um número de conta único para cada usuário.
As informações são armazenadas em um HashMap<Integer, Pessoa>, onde o número da conta é usado como chave para facilitar a consulta.

Acesso ao Banco
Para acessar o sistema bancário, o usuário deve informar seu número de conta.
Se o número da conta não for encontrado:
O sistema oferece a opção de realizar o cadastro ou sair do aplicativo.
Operações Bancárias

No menu do banco, o usuário pode realizar as seguintes operações:

Depositar
Permite ao usuário adicionar um valor ao saldo da sua conta.

Sacar
Permite ao usuário retirar um valor do saldo da conta, desde que tenha saldo suficiente.
Caso não haja saldo suficiente, o sistema exibe uma mensagem de erro.

Consultar Saldo
Exibe o saldo atual da conta.

Validações e Controle de Fluxo
O sistema usa validações com if-else para:
Confirmar se o número da conta está cadastrado.
Garantir que o saque não ultrapasse o saldo disponível.
Menus interativos são criados usando switch, o que torna a navegação mais intuitiva.
