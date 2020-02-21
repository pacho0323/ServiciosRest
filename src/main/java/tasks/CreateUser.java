package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class CreateUser implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Post.to("/users")
				.with(request -> request
						.header("Content-Type", "application/json")
				        .body("{\"firstName\": \"Sarah-Jane\",\"lastName\": \"Smith\"}")));

	}

	public static CreateUser withDate() {
		return instrumented(CreateUser.class);
	}
}
