# **API-SuperHero - Levi da Costa Bergamascki Martins e Polianna Albuquerque Lima** 

## URL DA API: https://superheroapi.com/index.html
### URL DE ACESSO A API: https://superheroapi.com/api/access-token/

### Método de autenticação: Token de acesso gerado ao logar no Facebook atráves do site da API. 
### 'api' é o endpoint, e os métodos:

| Referência    | Método        |
| ------------- | ------------- |
|/id            | GET           |
|/id/powerstats | GET           |
|/id/biography  | GET           |
|/id/appearance | GET           |
|/id/work       | GET           |
|/id/connections| GET           |
|/id/image      | GET           |
|/search/name   | GET           |

### Na aplicação usaremos o **biography**, o **work**, e o **image**

### Atributos/parâmetros solicitados por cada método: Nome ou ID
### Retornam: 
```json
{
  "response": "",
  "results-for": "",
  "results": [
    {
      "id": "",
      "name": "B",
      "powerstats": {
        "intelligence": "",
        "strength": "",
        "speed": "",
        "durability": "",
        "power": "",
        "combat": ""
      },
      "biography": {
        "full-name": "",
        "alter-egos": "",
        "aliases": [
          ""
        ],
        "place-of-birth": "",
        "first-appearance": "",
        "publisher": "",
        "alignment": ""
      },
      "appearance": {
        "gender": "",
        "race": "",
        "height": [
          "",
          ""
        ],
        "weight": [
          "",
          ""
        ],
        "eye-color": "",
        "hair-color": ""
      },
      "work": {
        "occupation": "",
        "base": ""
      },
      "connections": {
        "group-affiliation": "",
        "relatives": ""
      },
      "image": {
        "url": ""
      }
    }
```
## Mapa de navegação

O usuário entra no aplicativo e vê a tela inicial com um menu em carrossel que vai passando e mostrando as diferentes activities da aplicação, que seriam: 

![Alt text](https://github.com/levibergamascki/API-HERO/blob/main/inicio.png?raw=true "Inicio")
## * Cartas
Onde os usuários terão uma tela para pesquisar a carta de um determinado personagem pelo seu nome através de uma barra de pesquisa. O resultado dessa pesquisa seria exibido logo abaixo com a carta do herói, contendo informações como nome, altura, peso, poderes, todos dados fornecidos pela api.

![Alt text](https://github.com/levibergamascki/API-HERO/blob/main/tela_cartas.png?raw=true "Cartas")

## * Batalhas
Nessa tela, os usuários poderam escolher duas cartas de herói e gerar uma batalha entre as duas, batatalha essa em que o vencedor será decidido aatravés de uma comparação gerada pela análise dos atributos de habilidade que são fornecidos pela api.

![Alt text](https://github.com/levibergamascki/API-HERO/blob/main/tela_batalhas.png?raw=true "Batalhas")

## * Quiz
Na activity quiz, haverão perguntas sobre determinados heróis ou curiosidades sobre eles, e no final será apresentado o número de respostas certas e erradas.

![Alt text](https://github.com/levibergamascki/API-HERO/blob/main/tela_quiz.png?raw=true "Quiz")

              
## Diagrama de classes e do banco de dados

![Alt text](https://github.com/levibergamascki/API-HERO/blob/main/diagramas.jpeg?raw=true "Quiz")

