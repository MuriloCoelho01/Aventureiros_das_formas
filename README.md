
<h1>Aventuras Formas Proibida</h1>

<p>Este projeto é um aplicativo Android desenvolvido usando Jetpack Compose. Ele apresenta uma interface de login e cadastro de usuários e navegação entre telas, oferecendo um design estilizado com botões e campos de entrada personalizados.</p>

<h2>Estrutura do Projeto</h2>

<ul>
    <li><strong>MainActivity:</strong> Classe principal da aplicação, onde o tema e a navegação inicial são configurados.</li>
    <li><strong>Inicio:</strong> Função composable que define a estrutura inicial do aplicativo e configura o NavHost para navegar entre as telas.</li>
    <li><strong>Telas:</strong>
        <ul>
            <li><strong>Login:</strong> Tela de login com botões de navegação para as telas de "Cadastrar" e "Entrar".</li>
            <li><strong>Cadastro:</strong> Tela para cadastro de novos usuários, com campos de entrada para nome, e-mail e senha.</li>
            <li><strong>Entrar:</strong> Tela de entrada do usuário, onde é possível inserir nome de usuário e senha.</li>
        </ul>
    </li>
</ul>

<h2>Funcionalidades</h2>

<ul>
    <li>Interface de login e cadastro com design personalizado.</li>
    <li>Campos de entrada estilizados com cores específicas e cantos arredondados.</li>
    <li>Botões de navegação entre as telas de login, cadastro e entrada.</li>
</ul>

<h2>Dependências</h2>

<p>O projeto utiliza o <strong>Jetpack Compose</strong> para criação da interface de usuário e <strong>Navigation</strong> para navegação entre as telas.</p>

<h2>Cores</h2>

<p>O design do aplicativo utiliza uma paleta de cores personalizadas:</p>

<ul>
    <li><strong>Cor principal dos botões:</strong> #FFA62B</li>
    <li><strong>Cor do texto dos botões:</strong> #FFFFFF</li>
    <li><strong>Cor de fundo dos campos de texto:</strong> #FD2B977</li>
    <li><strong>Cor de texto do label:</strong> #FFD2B977</li>
    <li><strong>Cor de texto nos campos:</strong> #000000</li>
</ul>

<h2>Estrutura do Código</h2>

<p>Cada tela foi implementada como uma função composable independente:</p>

<ol>
    <li><strong>Login:</strong> Inclui botões para "Login" e "Cadastrar". Cada botão navega para uma tela diferente usando o NavController.</li>
    <li><strong>Cadastro:</strong> Possui campos de entrada para nome de usuário, e-mail e senha, com um botão "Cadastrar" que leva o usuário à tela de "Entrar".</li>
    <li><strong>Entrar:</strong> Tela onde o usuário insere suas informações de login (nome de usuário e senha) e navega para a tela inicial.</li>
</ol>

<h2>Pré-visualização</h2>

<p>As telas foram configuradas para visualização no Android Studio usando o <strong>@Preview</strong>. Assim, é possível pré-visualizar as telas "Inicio", "Cadastro" e "Entrar".</p>

<h2>Configuração do Projeto</h2>

<ol>
    <li>Clone o repositório do projeto.</li>
    <li>Abra o projeto no Android Studio.</li>
    <li>Compile e execute o aplicativo em um emulador ou dispositivo Android.</li>
</ol>

<h2>Imagens e Recursos</h2>

<ul>
    <li><strong>R.drawable.tela_de_fundo:</strong> Imagem de fundo usada em todas as telas.</li>
    <li><strong>R.drawable.ativo_2_1:</strong> Logotipo exibido na tela de login.</li>
    <li><strong>R.drawable.nomeapp:</strong> Imagem do nome do aplicativo exibida na tela de cadastro.</li>
</ul>

<h2>Licença</h2>

<p>Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.</p>

</body>
</html>

