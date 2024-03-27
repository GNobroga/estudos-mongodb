## Filtrando por notas

```bash
    db.collections.find({
        "notas": {
            $gt: 10
        }
    })
```

## Buscando 1


```bash
    db.collections.findOne({
        "notas": {
            $gt: 10
        }
    })
```


## Operadores 

- $gt
- $gte 

## Ordenando

```bash
    db.collections.findOne({
        "notas": {
            $gt: 10
        }
    }).sort({"nome": 1})
```