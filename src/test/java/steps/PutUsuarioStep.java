package steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.es.Cuando;
import tasks.UpdateUser;

public class PutUsuarioStep {
	
	@Cuando("^ingrese el dato a actualizar$")
	public void ingreseElDatoAActualizar() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(UpdateUser.withName());
	}
}
