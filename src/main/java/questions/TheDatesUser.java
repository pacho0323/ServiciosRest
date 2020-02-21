package questions;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

import java.util.ArrayList;
import java.util.List;

import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

	public class TheDatesUser implements Question<List<String>>{

		@Override
		public List<String> answeredBy(Actor actor) {
			User users =lastResponse() 
                    .jsonPath()
                    .getObject("data", User.class);
			
		List<String> datos = new ArrayList<String>();
		
			datos.add(users.getId());
			datos.add(users.getFirst_name());
			datos.add(users.getLast_name());
			datos.add("200");
			
			lastResponse().getBody().print();

			 return datos;
		}
		public static TheDatesUser are() {
			return new TheDatesUser();
		}
	}
