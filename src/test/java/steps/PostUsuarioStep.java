package steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.es.Cuando;
import tasks.CreateUser;

public class PostUsuarioStep {

	@Cuando("^ingrese los datos$")
	public void ingreseLosDatos() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(CreateUser.withDate());

	}
}
