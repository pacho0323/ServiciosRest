package steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.TheCodeResponse;
import questions.TheCreate;
import tasks.EnterData;

public class PostUsuarioStep {

	@Cuando("^ingrese los datos$")
	public void ingreseLosDatos(List<String> datos) {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(EnterData.users(datos.get(0), datos.get(1)));

	}

	@Entonces("^el vera el usuario creado$")
	public void elVeraElUsuarioCreado(List<String> datos) {
		theActorInTheSpotlight().should(
				seeThat(TheCreate.name(), equalTo(datos.get(0))),
				seeThat(TheCreate.last_Name(), equalTo(datos.get(1))),
				seeThat(TheCodeResponse.is(), equalTo(datos.get(2)))
				);
	}

}
