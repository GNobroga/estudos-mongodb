# Atualização

O comando **update** irá atualizar o primeiro documento que encontrar. Para atualizar todos  é necessário usar o multi

```bash
db.collection.update(
    {"nome": "Gabriel" },
    {
        $set: {
            "nome": "José"
        }
    },
    {
        multi: true
    }
)
```

## Remover

```bash
db.collection.remove({
    "_id": ObjectId("dsdsdsd")
})
```