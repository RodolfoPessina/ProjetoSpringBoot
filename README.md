# ScreenMatch

# Sobre o projeto
Screenmatch é uma aplicação Java que consulta e processa informações sobre séries de TV e seus episódios utilizando a API OMDb. O projeto utiliza Spring Boot para facilitar a execução e gerenciamento da aplicação e Jackson para manipulação de JSON.

Funcionalidades

Busca de Série: Permite buscar informações detalhadas sobre uma série de TV a partir do nome fornecido.

Listagem dos 10 Melhores Episódios: Classifica e exibe os 10 episódios mais bem avaliados.

Busca por Título de Episódio: Permite procurar um episódio específico com base em um trecho do título.

Análise de Avaliações: Calcula e exibe a média das avaliações por temporada, além de informações estatísticas sobre os episódios.


# Sobre o Projeto
Screenmatch é uma aplicação Java que consulta e processa informações sobre séries de TV e seus episódios utilizando a API OMDb.

O projeto utiliza Spring Boot para facilitar a execução e gerenciamento da aplicação e Jackson para manipulação de JSON.

# Funcionalidades
Busca de Série: Permite buscar informações detalhadas sobre uma série de TV a partir do nome fornecido.

Listagem dos 10 Melhores Episódios: Classifica e exibe os 10 episódios mais bem avaliados.

Busca por Título de Episódio: Permite procurar um episódio específico com base em um trecho do título.

Análise de Avaliações: Calcula e exibe a média das avaliações por temporada, além de informações estatísticas sobre os episódios.

# Estrutura do Projeto

• Pacotes e Classes:

• br.com.rodolfopessina.Screenmatch.model:


DadosEpisodio: Representa os dados de um episódio, incluindo título, número, avaliação e data de lançamento.

DadosSerie: Representa os dados de uma série, incluindo título, número total de temporadas e avaliação.

DadosTemporada: Representa uma temporada da série, incluindo o número da temporada e uma lista de episódios.

Episodio: Classe que transforma DadosEpisodio em um formato mais utilizável para cálculos e manipulações.


• br.com.rodolfopessina.Screenmatch.service:

ConsumoApi: Classe responsável por fazer chamadas HTTP para a API OMDb e obter dados em formato JSON.

ConvertDados: Classe para converter JSON em objetos Java usando a biblioteca Jackson.

IConvertDados: Interface para a conversão de dados.

• br.com.rodolfopessina.Screenmatch:

Principal: Classe principal que executa a aplicação, exibe um menu para o usuário e processa a entrada.
ScreenmatchApplication: Classe principal do Spring Boot que inicializa a aplicação.

# Tecnologias utilizadas
## Back end
- Java: Linguagem de programação usada para desenvolver a aplicação.
- Spring Boot: Framework para criar aplicações Java.
- Jackson: Biblioteca para processamento de JSON.

# Instruções para Execução
## Pré-requisitos:

- Java 11 ou superior: Certifique-se de ter o JDK 11 ou superior instalado.
- Maven: Para compilar e executar a aplicação.


