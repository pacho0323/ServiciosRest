package questions;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

import net.serenitybdd.screenplay.Question;

public class TheCreate {

	public static Question<String> name() {
		return actor -> lastResponse().jsonPath().get("firstName");
	}

	public static Question<String> last_Name() {
		return actor -> lastResponse().jsonPath().get("lastName");
	} 
}
