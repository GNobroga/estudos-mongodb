# Consultas

Esse comando serve para buscar os dados da collection

```bash
    db.nomeColecction.find()
```

```bash
    db.nomeColecction.find().pretty()
```

Procurando os documentos onde tenha um nome igual a Gabriel

```bash
    db.nomeColecction.find({ "nome": "Gabriel" })
```

## Buscando subconsultas

```bash
db.collection.find({ "skills.nome": "C#" })
```

## Operadores

### Operadores de comparação

- $eq
- $gt
- $gte
- $in
- $lt
- $lte
- $ne
- $nin

### Operadores lógico

- $and
- $not
- $nor
- $or

### Operadores elemento


- $exists
- $type

### Operadores de avaliação

- $expr
- $jsonSchema
- $mod
- $regex
- $text
- $where

### Operadores para Array

- $all
- $elemMatch
- $size



```bash
db.collection.find({
    $or: [
        {
            "curso.nome": "Ciência da Computação"
        },
          {
            "curso.nome": "Matemática"
        }
    ]
})
```

## Consulta com operador e and

```bash
db.collection.find({
    $or: [
        {
            "curso.nome": "Ciência da Computação"
        },
          {
            "curso.nome": "Matemática"
        }
    ],
    "nome": "Gabriel"
})
```

## Mais

```js
db.inscricoes.insert(
	{
		"aluno": "Paula Fernandes",
		"data": new Date(),
		"curso": {
			"nome": "Programação para Internet"
		}
	}
)


db.inscricoes.insert(
	{
		"aluno": "Fernanda da Silva",
		"data": new Date(),
		"curso": {
			"nome": "Ciência da Computação"
		},
		"notas": [9.0, 7.0, 8],
		"skills": [
			{
				"nome": "Python",
				"nivel": "avançado"
			},
			{
				"nome": "Banco de Dados",
				"nivel": "avançado"
			}
		]
	}
)


db.inscricoes.insert(
	{
		"aluno": "Fabiano Perez",
		"data": new Date(),
		"curso": {
			"nome": "Programação para Internet"
		},
		"skills": [
			{
				"nome": "Python",
				"nivel": "básico"
			}
		]
	}
)


db.inscricoes.find(
	{
		"skills.nome": "Python"
	}
)


db.inscricoes.find(
	{
		"skills.nome": "Python",
		"skills.nivel": "avançado"
	}
)

// SELECT * FROM inscricoes AS i, skills AS s WHERE i.skill_id = s.id AND s.nome = 'Python' AND s.nivel = 'avançado';

db.inscricoes.find(
	{
		"curso.nome": "Programação para Internet"
	}
)


db.inscricoes.find(
	{
		$or: [
			{"curso.nome": "Ciência da Computação"},
			{"curso.nome": "Programação para Internet"}
		]
	}
)


db.inscricoes.find(
	{
		$or: [
			{"curso.nome": "Ciência da Computação"},
			{"curso.nome": "Programação para Internet"}
		],
		"aluno": "Fabiano Perez"
	}
)

db.inscricoes.find(
	{
		"nome": "Fabiano Perez"
	}
)


db.inscricoes.find(
	{
		"skills.nome": "Python",
		"skills.nivel": {
			$in: ["avançado", "intermediário"]
		}
	}
)

```
