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