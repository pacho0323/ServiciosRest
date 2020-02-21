package steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.TheCode;
import tasks.DeleteUser;

public class DeleteUsuarioStep {

	@Cuando("^ingrese el dato a eliminar$")
	public void ingreseElDatoAEliminar() {

		theActorInTheSpotlight().attemptsTo(DeleteUser.withId());

	}
	@Entonces("^verá el código de respuesta (\\d+)$")
	public void veráElCódigoDeRespuesta(int code) {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().should(seeThat(TheCode.is(), equalTo(code)));
	}
}
