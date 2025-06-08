# 🧪 Plan de Pruebas – CRUD de usuarios en Reqres

## ✅ Objetivo

Validar las operaciones básicas de un CRUD (Create, Read, Update, Delete) sobre la API pública de [Reqres](https://reqres.in), asegurando que los códigos de respuesta HTTP y los datos retornados sean consistentes con lo esperado.

---

## 🔍 Alcance

### Incluye:
- Crear usuario (`POST`)
- Consultar usuario (`GET`)
- Actualizar usuario (`PUT`)
- Eliminar usuario (`DELETE`)
- Validación de códigos de estado y campos claves de respuesta


---

## 📌 Escenarios cubiertos

### @POST – Crear un usuario
- Se crea un nuevo usuario con nombre `"Juan"` y trabajo `"QA"`
- Se valida código HTTP `201`
- Se valida que el nombre retornado sea `"Juan"`

### @GET – Consultar un usuario por ID
- Se consulta el usuario con ID `2`
- Se valida código HTTP `200`
- Se verifica que el cuerpo contenga un `email`

### @PUT – Actualizar un usuario
- Se actualiza el usuario con ID `2` con nombre `"Juan"` y trabajo `"Tester Senior"`
- Se valida código HTTP `200`
- Se verifica que el campo `"job"` devuelto sea `"Tester Senior"`

### @DELETE – Eliminar un usuario
- Se elimina el usuario con ID `2`
- Se valida código HTTP `204` (sin contenido)

---

## ⚙️ Técnicas de prueba aplicadas

| Técnica                  | Aplicación en los escenarios                                                |
|--------------------------|------------------------------------------------------------------------------|
| Partición de equivalencia | Operación válida con ID existente (ID = 2)                                  |
| Pruebas de contrato       | Validación de campos esperados en la respuesta (`email`, `job`, `name`, etc.) |
| Pruebas funcionales       | Cada endpoint es probado en condiciones normales de uso                     |
| BDD                       | Uso de Gherkin con tags para CRUD (`@POST`, `@GET`, etc.)                   |

---

## 🧪 Datos de prueba utilizados

| ID usado | Nombre | Trabajo        |
|----------|--------|----------------|
| 2        | Juan   | QA / Tester Senior |

---

## 📎 Evidencias esperadas

- Capturas o logs de respuestas que muestren:
    - Código de respuesta esperado (`201`, `200`, `204`)
    - Datos consistentes en la respuesta (`name`, `job`, `email`, etc.)
    - Los resultados de la ejecución de pruebas se publicarán en formato HTML y serán accesibles dentro del repositorio (`/target/site/serenity/index.html`).


---

## 👤 Autor

Juan Ernesto Rebatta Atoche  
Reto técnico – QA Automation Engineer
