package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class DeleteUser implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
		        Delete.from("/users/1")
		);

	}

	public static DeleteUser withId() {
		return instrumented(DeleteUser.class);
	}
}
