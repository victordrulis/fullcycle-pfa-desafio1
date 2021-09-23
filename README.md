# fullcycle-pfa-desafio1
Fullcycle PFA - Desafio 1

# Desafio 1
## Descrição:
Crie um programa utilizando sua linguagem de programação favorita que faça uma listagem 
simples do nome de alguns módulos do curso Full Cycle os trazendo de um banco de dados 
MySQL. Gere a imagem desse container e a publique no DockerHub.

Gere uma imagem do nginx que seja capaz que receber as solicitações http e encaminhá-las para o container.

Crie um repositório no github com todo o fonte do programa e das imagens geradas.

Crie um arquivo README.md especificando quais comandos precisamos executar para que a aplicação
funcione recebendo as solicitações na porta 8080 de nosso computador. Lembrando que NÃO 
utilizaremos Docker-compose nesse desafio.

## Solução
### 1. BD Mysql8

### 2. Aplicação Spring REST rodando no Tomcat 8 - jdk11
Essa aplicação utiliza o Maven Wrapper para baixar as dependências necessárias do projeto Spring REST em qualquer S.O..
Os comandos abaixo devem ser executado em um terminal, a partir do diretório do projeto Spring:

#### Gerar o arquivo war para o deploy no Tomcat
`$ ./mvnw clean package` 

#### Se preferir executar com o web server embutido
`$ ./mvnw spring-boot:run`

### 3. Nginx