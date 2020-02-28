package questions;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

import net.serenitybdd.screenplay.Question;

public class TheCodeResponse {
	public static Question<String> is() {
		return actor -> Integer.toString(lastResponse().getStatusCode());
	}
}
