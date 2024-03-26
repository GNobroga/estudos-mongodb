# Inserção

MongoDb é baseado em JavaScript e por isso é possível usar algumas classes com Date, etc.

```bash
db.collection.insert({
    "nome": "Gabriel"
})
```

## Criar uma coleção

```bash
db.createCollection("name")
```

```bash
db.collection.insert({
    "nome": "Gabriel",
    "data": new Date()
})
```