package questions;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class TheUser {
	
	 @Step("{0} vera el id")  
	public static Question<String> id() {
		return actor -> Integer.toString(lastResponse().jsonPath().get("data.id"));
	}
	 @Step("{0} vera el nombre")  
	public static Question<String> name() {
		return actor -> lastResponse().jsonPath().get("data.first_name");
	}
	 @Step("{0} vera el apellido")  
	public static Question<String> last_Name() {
		return actor -> lastResponse().jsonPath().get("data.last_name");
	}

}
