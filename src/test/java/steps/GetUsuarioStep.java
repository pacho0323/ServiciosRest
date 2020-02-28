package steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.TheCodeResponse;
import questions.TheUser;
import tasks.FindAUser;

public class GetUsuarioStep {

	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());

	}

	@Dado("^que el usuario ingrese la url del servicio$")
	public void queElUsuarioIngreseLaUrlDelServicioHttpsReqresIn() {
		theActorCalled("juan").whoCan(CallAnApi.at("https://reqres.in/api"));
	}

	@Cuando("^ingrese el id$")
	public void ingreseElId() {
		
	}
	@Cuando("^ingrese el (\\d+)$")
	public void ingreseEl(String id) {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(FindAUser.withId(id));
	}

	@Entonces("^ver· en la respuesta los datos$")
	public void ver·EnLaRespuestaLosDatos(List<String> datos) {

		theActorInTheSpotlight().should(seeThat(TheUser.id(), equalTo(datos.get(0))),
				seeThat(TheUser.name(), equalTo(datos.get(1))),
				seeThat(TheUser.last_Name(), equalTo(datos.get(2))),
				seeThat(TheCodeResponse.is(), equalTo(datos.get(3))));
	}

}
