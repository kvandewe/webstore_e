import com.sbif.tut.domain.Passenger
import com.sbif.tut.domain.Person

class BootStrap {

    def init = { servletContext ->
		if (Passenger.count() == 0) {
			new Passenger(firstName: 'Koen', lastName: 'Van de Weyer', age: 40, email:'koenvandeweyer@gmail.com').save()
			new Passenger(firstName: 'Constance', lastName: 'Grill', age: 48, email:'cjgrill@me.com').save()
			new Passenger(firstName: 'Olivia', lastName: 'Van de Weyer', age: 42, email: 'vandeweyer.olivia@gmail.com').save()
		}
    }
    def destroy = {
    }
}
