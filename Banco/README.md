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
