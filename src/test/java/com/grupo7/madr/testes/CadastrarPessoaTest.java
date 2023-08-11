package com.grupo7.madr.testes;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grupo7.madr.model.Pessoa;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.beans.factory.annotation.Autowired;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("featurefiles/salvarUmaPessoa.feature")
public class CadastrarPessoaTest {

    @Autowired
    ObjectMapper objectMapper;
    private Response response;

    @When("Um pedido de cadastrar uma pessoa é enviado")
    public void umPedidoDeCadastrarUmaPessoaÉEnviado() throws JsonProcessingException {
        String pessoaJson = objectMapper.writeValueAsString(criaPessoa());

        response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(pessoaJson)
                .when()
                .post("/api/pessoa");
    }

    @Then("Uma pessoa é salva com sucesso")
    public void umaPessoaÉSalvaComSucesso() {
        Pessoa pessoaCriada = response.getBody().as(Pessoa.class);
        Assertions.assertNotNull(pessoaCriada);
        Assertions.assertNotNull(pessoaCriada.getId());
    }

    @Then("o cliente recebe o código de status 201")
    public void oClienteRecebeOCódigoDeStatus200() {
        Assertions.assertEquals(201, response.getStatusCode());
    }

    private Pessoa criaPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Afrano Alves Garcia");
        pessoa.setCpf("12345678911");
        pessoa.setIdade(33);
        pessoa.setTelefone("839995711111");
        return pessoa;
    }

}
