🧪 Proyecto de Automatización – CRUD de Usuarios en Reqres (Java + Serenity REST)

Este repositorio contiene pruebas automatizadas para validar operaciones CRUD sobre la API pública de Reqres (https://reqres.in), utilizando Java, Serenity BDD, RestAssured y Cucumber con enfoque BDD.

---

✅ Requisitos previos

- Java 11 o superior
- Maven instalado
- IDE (IntelliJ IDEA, VS Code o Eclipse)

---

🚀 Instalación y ejecución

1. Clona el repositorio:

git clone https://github.com/tu-usuario/proyecto-crud-reqres.git
cd proyecto-crud-reqres

2. Instala dependencias y ejecuta todas las pruebas:

mvn clean verify

3. Ejecuta pruebas por tag (ejemplo: @CRUD):

mvn clean verify -Dcucumber.options="--tags @CRUD"

---

📁 Estructura del proyecto

src/test/java/
├── steps/                  # Step definitions (CrudUsuarioSteps.java)
src/test/resources/
├── features/               # Archivo crud.feature con los escenarios
utils/
├── UserRequest.java        # Clase auxiliar
target/
├── site/serenity/          # Reportes generados por Serenity
plan-pruebas.md             # Plan de pruebas documentado
README.md                   # Este archivo
pom.xml                     # Configuración de dependencias y plugins

---

🧪 Tags disponibles

- @CRUD → Ejecuta todos los escenarios de CRUD
- @POST → Crear usuario
- @GET → Consultar usuario
- @PUT → Actualizar usuario
- @DELETE → Eliminar usuario

---

📎 Reportes

Al finalizar la ejecución, Serenity genera un reporte HTML en:

target/site/serenity/index.html

Abre ese archivo en tu navegador para ver los resultados detallados.

---

👤 Autor

Juan Ernesto Rebatta Atoche
Reto técnico – QA Automation Engineer
