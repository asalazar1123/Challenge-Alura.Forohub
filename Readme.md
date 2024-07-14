# Desafio Alura ForoHub 🖥⌨
Desafio que consta de crear un foro , utilizando lo aprendido en los cursos Spring

## Instrucciones:

### Agregar Tópico

- **URL:** `/topicos`
- **Método:** `POST`
- **Descripción:** Agrega un nuevo tópico.
- **Cuerpo de la Solicitud:**
  ```json
  {
      "titulo": "string",
      "mensaje": "string",
      "fechaCreacion": "yyyy-MM-ddTHH:mm:ss",
      "status": true,
      "autor": "string",
      "curso": "string"
  }

### Actualizar Tópico

- **URL:** `/topicos`
- **Método:** `PUT`
- **Descripción:** Actualiza un tópico.
- **Cuerpo de la Solicitud:**
  ```json
  {
      "id": int
      "titulo": "string",
      "mensaje": "string",
      "fechaCreacion": "yyyy-MM-ddTHH:mm:ss",
      "status": true,
      "autor": "string",
      "curso": "string"
  }

### Listar Tópicos

- **URL:** `/topicos`
- **Método:** `GET`
- **Descripción:** Lista todos los tópicos.

### Detalle Tópico

- **URL:** `/topicos/{id}`
- **Método:** `GET`
- **Descripción:** Detalle de un tópico.

### Eliminar Tópico

- **URL:** `/topicos/{id}`
- **Método:** `DELETE`
- **Descripción:** Elimina un tópico.

### Login de Usuario

- **URL:** `/login`
- **Método:** `POST`
- **Descripción:** Obtiene el JWT para realizar las otras solicitudes.
- **Cuerpo de la Solicitud:**
  ```json
  {
      "login": "string",
      "clave": "string"
  }

### Tecnologías ✨

- Java Spring

### Contacto

- salazaralexander2@gmail.com