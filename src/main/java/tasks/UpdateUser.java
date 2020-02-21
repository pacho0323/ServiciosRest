package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

public class UpdateUser implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Put.to("/users")
				.with(request -> request.header("Content-Type", "application/json")
				.body("{\"firstName\": \"jack\",\"lastName\": \"smith\"}")));
	}

	public static UpdateUser withName() {
		return instrumented(UpdateUser.class);
	}
}