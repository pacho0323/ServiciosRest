package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class EnterData implements Task {
	private String name;
	private String lastName;

	public EnterData(String name, String lastName) {

		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Post.to("/users").with(request -> request.header("Content-Type", "application/json")
				.body("{\"firstName\": \"" + name + "\",\"lastName\": \"" + lastName + "\"}")));

	}

	public static EnterData users(String name, String lastName) {
		return instrumented(EnterData.class, name, lastName);
	}
}
