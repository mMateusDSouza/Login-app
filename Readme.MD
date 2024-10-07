# Login-app

## Objetivo
Criar um sistema de login e cadastro simples usando Java, Swing e MySQL.

## Tecnologias Utilizadas OK
- **Java**: Linguagem de programação principal.
- **Swing**: Biblioteca para construção da interface gráfica.
- **MySQL**: Sistema de gerenciamento de banco de dados.
- **JDBC**: Conector para interação entre Java e MySQL.
- **BCrypt**: Biblioteca para hashing seguro de senhas.

## Requisitos Funcionais
- **Sistema de Login**: Usuários podem entrar no sistema usando seu e-mail e senha.
- **Cadastro de Usuário**: Usuários podem se cadastrar com nome, e-mail e senha.

## Requisitos Não Funcionais
- **Segurança**: As senhas devem ser armazenadas de forma segura usando hashing (BCrypt).
- **Usabilidade**: A interface deve ser simples e intuitiva.
- **Desempenho**: O sistema deve responder rapidamente às interações do usuário.

## Banco de Dados

### Nome do Banco de Dados
**Login-app**    OK

### Tabela: Users      OK
#### Estrutura da Tabela   OK
| Coluna | Tipo     | Descrição                     |
|--------|----------|-------------------------------|
| id     | INT      | Identificador único do usuário (chave primária, auto-incremento) |
| nome   | VARCHAR  | Nome do usuário               |
| email  | VARCHAR  | E-mail do usuário (único)     |
| senha  | VARCHAR  | Senha do usuário (hash)       |

### Conexão com o Banco de Dados
- O sistema deve se conectar ao banco de dados MySQL utilizando JDBC.
- Certifique-se de que o driver JDBC para MySQL está incluído nas dependências do projeto.

## Como Executar o Projeto
1. **Clone o repositório**: 
   ```bash
   git clone <URL-do-repositório>  

Projeto em Fase inicial(não execultavel) 
