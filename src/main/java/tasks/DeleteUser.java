package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class DeleteUser implements Task {
	private String id;

	public DeleteUser(String id) {

		this.id = id;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Delete.from("/users/" + id));

	}

	public static DeleteUser withId(String id) {
		return instrumented(DeleteUser.class, id);
	}
}
