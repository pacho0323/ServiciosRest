package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class FindAUser implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
 
        	     actor.attemptsTo(
        	    		 Get.resource("/users/")
                         .with(request -> request.param("id", 1))
     	        );
        
    }

    public static FindAUser withId() {
        return instrumented(FindAUser.class);
    }
}
