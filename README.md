# GiggleBot

**GiggleBot** es una API REST creada con Spring Boot que permite gestionar frases graciosas. Soporta operaciones CRUD (crear, leer, actualizar y eliminar) y está diseñada para ser fácilmente ampliable a otros tipos de frases como inspiradoras o *Lorem Ipsum*.

## Características

- Gestión de frases con texto y autor.
- Endpoints para listar, agregar, editar, eliminar y buscar frases por ID.
- Estructura modular con capas `Controller`, `Service` y `Repository`.

## Requisitos

- Java 21
- Maven
- IntelliJ IDEA (recomendado)
- Postman o cualquier herramienta para pruebas de API (opcional)

## Estructura del Proyecto

- `FunnyPhrase`: Entidad principal que representa una frase graciosa.
- `FunnyPhraseRepository`: Interfaz que extiende `JpaRepository` para operaciones de base de datos.
- `FunnyPhraseService`: Clase de servicio que encapsula la lógica de negocio.
- `FunnyPhraseController`: Controlador que expone los endpoints REST.

## Endpoints

- `GET /FunnyPhrases`: Retorna todas las frases registradas.
- `GET /FunnyPhrases/{id}`: Retorna una frase por su ID.
- `POST /FunnyPhrases`: Crea una nueva frase.
- `PUT /FunnyPhrases/{id}`: Actualiza el contenido y/o autor de una frase.
- `DELETE /FunnyPhrases/{id}`: Elimina una frase por su ID.

## Formato de la Frase

Cada frase tiene la siguiente estructura en formato JSON:

```json
{
  "id": 1,
  "phrase": "El café me entiende.",
  "author": "Desconocido"
}
```
## Ejecución

1. Clona este repositorio en tu entorno local.
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecuta la aplicación desde la clase principal con `@SpringBootApplication`.
4. La API estará disponible en: `http://localhost:8080`

## Pruebas

- Se recomienda utilizar Postman para probar los diferentes endpoints.
- Asegúrate de enviar el contenido como `application/json` en el cuerpo de las peticiones `POST` y `PUT`.

## Futuras mejoras

- Añadir validaciones a los campos `phrase` y `author`.
- Implementar control de excepciones personalizado.
- Incluir otros tipos de frases como inspiradoras o *Lorem Ipsum*.
- Agregar tests automatizados.