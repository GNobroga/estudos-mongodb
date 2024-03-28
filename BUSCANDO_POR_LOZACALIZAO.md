
Obs: Quando vamos trabalhar com coordenadas geográficas no MongoDB precisamos ter um campo chamdo **coordinates** e especificar o **type**.

```js
    db.collections.update(
        {"_id": ObjectId("232323")},
        {
            $set: {
                "location": {
                    "address": "dsds",
                    "coordinates": [12, -23],
                    "type": "Point"
                }
            }
        }
    )
```

## Importar JSON

```bash
    mongoimport -d <nome-do-banco> -c <nome-da-collection> --jsonArray < incricoes.json
```

## Criar index

```bash
    db.collections.createIndex({
        "field": "value"
    })
```

## Group Bt

```bash
    db.collections.aggregate([
        {
            $geoNear: {
                "near": {
                    "coordinates": [12, -23],
                    "type": "Point"
                },
                "distanceField": "distancia.calculada",
                "spherical": true,
                "num": 4
            }
        }
    ])
```