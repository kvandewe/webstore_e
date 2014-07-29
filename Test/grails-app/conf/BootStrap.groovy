import com.sbif.tut.domain.Passenger
import com.sbif.tut.domain.Person

class BootStrap {

    def init = { servletContext ->
		if (Passenger.count() == 0) {
			new Passenger(firstName: 'Koen', lastName: 'Van de Weyer', age: 40, mainEmail:'koenvandeweyer@gmail.com').save()
			new Passenger(firstName: 'Constance', lastName: 'Grill', age: 48, mainEmail:'cjgrill@me.com').save()
			new Passenger(firstName: 'Scott', lastName: 'Robinson', age: 42, mainEmail: 'scott@rob.com').save()
		}
    }
    def destroy = {
    }
}
