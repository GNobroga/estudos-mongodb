
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