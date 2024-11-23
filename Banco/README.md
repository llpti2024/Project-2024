
    <p>Este é um projeto que desenvolvi como parte do meu aprendizado e prática de programação em Java. Ele é um aplicativo simples de console que combina um sistema de cadastro de usuários com funcionalidades básicas de operações bancárias. Apesar de ser um projeto de estudo, busquei aplicar boas práticas e organizar o código de forma clara e funcional.</p>
    
    <h2><b>Funcionalidades</b></h2>
    
    <h3><b>Cadastro de Usuários</b></h3>
    <ul>
        <li>Os usuários podem se cadastrar informando <b>nome completo</b> e <b>CPF</b>.</li>
        <li>Após o cadastro, o sistema gera automaticamente um <b>número de conta único</b> para cada usuário.</li>
        <li>As informações são armazenadas em um <b>HashMap&lt;Integer, Pessoa&gt;</b>, onde o número da conta é usado como chave para facilitar a consulta.</li>
    </ul>
    
    <h3><b>Acesso ao Banco</b></h3>
    <ul>
        <li>Para acessar o sistema bancário, o usuário deve informar seu <b>número de conta</b>.</li>
        <li>Se o número da conta não for encontrado:
            <ul>
                <li>O sistema oferece a opção de realizar o cadastro ou sair do aplicativo.</li>
            </ul>
        </li>
    </ul>
    
    <h3><b>Operações Bancárias</b></h3>
    <p>No menu do banco, o usuário pode realizar as seguintes operações:</p>
    <ul>
        <li><b>Depositar</b>: Permite ao usuário adicionar um valor ao saldo da sua conta.</li>
        <li><b>Sacar</b>:
            <ul>
                <li>Permite ao usuário retirar um valor do saldo da conta, desde que tenha saldo suficiente.</li>
                <li>Caso não haja saldo suficiente, o sistema exibe uma mensagem de erro.</li>
            </ul>
        </li>
        <li><b>Consultar Saldo</b>: Exibe o saldo atual da conta.</li>
    </ul>
    
    <h3><b>Validações e Controle de Fluxo</b></h3>
    <ul>
        <li>O sistema usa validações com <b>if-else</b> para:
            <ul>
                <li>Confirmar se o número da conta está cadastrado.</li>
                <li>Garantir que o saque não ultrapasse o saldo disponível.</li>
            </ul>
        </li>
        <li>Menus interativos são criados usando <b>switch</b>, o que torna a navegação mais intuitiva.</li>
    </ul>
