@CRUD
Feature: CRUD de usuarios en Reqres

  @POST
  Scenario: Crear un nuevo usuario
    When el usuario crea uno nuevo con nombre "Juan" y trabajo "QA"
    Then la respuesta debe tener código 201 y el nombre debe ser "Juan"

  @GET
  Scenario: Consultar un usuario por ID
    When el usuario consulta el ID 2
    Then la respuesta debe tener código 200 y debe contener el email

  @PUT
  Scenario: Actualizar un usuario existente
    When el usuario actualiza el ID 2 con nombre "Juan" y trabajo "Tester Senior"
    Then la respuesta debe tener código 200 y el trabajo debe ser "Tester Senior"

  @DELETE
  Scenario: Eliminar un usuario
    When el usuario elimina el ID 2
    Then la respuesta debe tener código 204
