# appGrupo3Productor

T1 Grupo 3 - Envio de numeros mediante RabbitMQ.

## Reglas aplicadas

- Spring Boot: `4.1.1`
- Spring Cloud: `2025.1.3`
- Java: `25`
- Queue: `Grupo3Queue`
- Exchange: `Grupo3Exchange`
- Routing key: `Grupo3Routing`

## Endpoint

```http
GET /api/fibonacci/send?numbers=1;2;15;8
```

Respuesta:

```text
Lista enviada a RabbitMQ correctamente.
```

## Mensaje enviado a RabbitMQ

El productor envia un DTO con el campo `numbers`:

```json
{
  "numbers": "1;2;15;8"
}
```

## Integrantes

- Ignacio Rodrigo Machuca Gutierrez
- Carquin Hoyos Carlos Alonso
- Angélica Egas Quispe
- Jhaser Alexander Campos Castañeda
