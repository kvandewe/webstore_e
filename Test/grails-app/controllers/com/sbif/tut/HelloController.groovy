package com.sbif.tut

import groovy.util.logging.Log

import com.sbif.tut.domain.Passenger
import com.sbif.tut.domain.Person2

@Log
class HelloController {

	def index() {
		def list =[]
		Passenger passenger = Passenger.find(mainEmail:'koenvandeweyer@gmail.com')
		list << passenger
		passenger = new Passenger (firstName:'Olivia', lastName:'Van de Weyer', age:10)
		list << passenger
		[list:list]
	}

	def hi() {
		
	}
	
	def save(Passenger passenger) {
		Log .info ${passenger.firstName}, ${passenger.age}
	}
	
	def displayForm() {
		// just provide value for age. First Name and Last name are blanks.
		Passenger passenger = new Passenger(age:55)
		[ passenger:passenger ]
	}
	
}
