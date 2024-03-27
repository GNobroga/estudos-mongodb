# Atualização

O comando **update** irá atualizar o primeiro documento que encontrar. Para atualizar todos  é necessário usar o multi

```bash
db.collection.update(
    {"nome": "Gabriel" }, // Critério de consulta
    {
        $set: {
            "nome": "José" // Operação de atualização
        }
    },
    {
        multi: true /// Atualiza múltiplos documentos
    }
)
```

ou 

```bash
db.colecao.updateMany(
   { campo: valor },  // Critério de consulta
   { $set: { campoParaAtualizar: novoValor } } // Operação de atualização
)

```

## Remover

```bash
db.collection.remove({
    "_id": ObjectId("dsdsdsd")
})
```

## Operadores

- $set 
- $push - Só adiciona 1 elemento dentro de 1 array
- $each