package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import utils.UserRequest;

public class CrudUsuarioSteps {

    private static final String BASE_URL = "https://reqres.in/api";
    private static final String API_KEY = "reqres-free-v1";
    private static final String API_KEY_HEADER = "x-api-key";

    // CREATE
    @When("el usuario crea uno nuevo con nombre {string} y trabajo {string}")
    public void crearUsuario(String nombre, String trabajo) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .header(API_KEY_HEADER, API_KEY)
                .body(new UserRequest(nombre, trabajo))
                .when()
                .post(BASE_URL + "/users");
    }

    @Then("la respuesta debe tener código 201 y el nombre debe ser {string}")
    public void validarCreacionUsuario(String nombreEsperado) {
        SerenityRest.then()
                .statusCode(201)
                .body("name", Matchers.equalTo(nombreEsperado));
    }

    // READ
    @When("el usuario consulta el ID {int}")
    public void consultarUsuario(int id) {
        SerenityRest.given()
                .header(API_KEY_HEADER, API_KEY)
                .when()
                .get(BASE_URL + "/users/" + id);
    }

    @Then("la respuesta debe tener código 200 y debe contener el email")
    public void validarConsultaUsuario() {
        SerenityRest.then()
                .statusCode(200)
                .body("data.email", Matchers.containsString("@reqres.in"));
    }
}
