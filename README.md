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
|/id/work       | GET           |
|/id/image      | GET           |
|/search/name   | GET           |

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
