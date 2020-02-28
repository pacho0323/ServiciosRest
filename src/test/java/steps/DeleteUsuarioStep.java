package steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.TheCodeResponse;
import tasks.DeleteUser;

public class DeleteUsuarioStep {

	@Cuando("^ingrese el id (\\d+)$")
	public void ingreseElId(String id) {

		theActorInTheSpotlight().attemptsTo(DeleteUser.withId(id));
	}

	@Entonces("^verá el código de respuesta (\\d+)$")
	public void veráElCódigoDeRespuesta(String code ) {

		theActorInTheSpotlight().should(
				seeThat(TheCodeResponse.is(), equalTo(code)));
	}
}
