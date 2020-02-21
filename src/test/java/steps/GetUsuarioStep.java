package steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.hasItems;

import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import questions.TheDatesUser;
import tasks.FindAUser;

public class GetUsuarioStep {

	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());

	}

	@Dado("^que el usuario ingrese la url del servicio$")
	public void queElUsuarioIngreseLaUrlDelServicioHttpsReqresIn() {
		// Write code here that turns the phrase above into concrete actions
		theActorCalled("juan").whoCan(CallAnApi.at("https://reqres.in/api"));
	}

	@Cuando("^ingrese el id$")
	public void ingreseElId() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(FindAUser.withId());
	}

	@Entonces("^verá el código de respuesta$")
	public void veráElCódigoDeRespuesta(List <String> datos)  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight()
		.should(seeThat(TheDatesUser.are(), 
				hasItems(datos.get(0),datos.get(1),datos.get(2),datos.get(3))
				));
	}

}
