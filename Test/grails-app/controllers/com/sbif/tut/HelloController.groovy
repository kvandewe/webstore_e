package com.sbif.tut

import java.lang.ref.ReferenceQueue.Null;

import groovy.util.logging.Log

import com.sbif.tut.domain.Passenger

@Log
class HelloController {

	def index() {
		def list =[]
		list = Passenger.list()
		list = null
//		Passenger passenger = Passenger.findByEmail(mainEmail:'koenvandeweyer@gmail.com')
//		list << passenger
//		passenger = new Passenger (firstName:'Olivia', lastName:'Van de Weyer', age:10)
//		list << passenger
		[list:list]
	}

	def hi() {
		render 'Hi'
	}
	
	def save(Passenger passenger) {
//		Log .info ${passenger.firstName}, ${passenger.age}
	}
	
	def displayForm() {
		// just provide value for age. First Name and Last name are blanks.
		Passenger passenger = new Passenger(age:55)
		[ passenger:passenger ]
	}
	
}
