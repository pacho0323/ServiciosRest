package questions;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheCode implements Question<Integer> {

	@Override
	public Integer answeredBy(Actor actor) {

		return lastResponse().getStatusCode();
	}

	public static TheCode is() {
		return new TheCode();
	}
}