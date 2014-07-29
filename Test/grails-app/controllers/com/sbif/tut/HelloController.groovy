package com.sbif.tut

import groovy.util.logging.Log

import com.sbif.tut.domain.Passenger
import com.sbif.tut.domain.Person2

@Log
//@Controller
class HelloController {

	def index() {
		def list =[]
		Passenger pgr = Passenger.find(mainEmail:'koenvandeweyer@gmail.com')
		list << pgr
		[list:list]
	}

	def save(Passenger person) {
		Log .info ${person.firstName}, ${person.age}
	}
	
	def displayForm() {
		// just provide value for age. First Name and Last name are blanks.
		Passenger person = new Passenger(age:55)
		[ person:person ]
	}
	
}
