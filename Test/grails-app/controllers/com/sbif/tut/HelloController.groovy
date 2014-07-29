package com.sbif.tut

import groovy.util.logging.Log

import com.sbif.tut.domain.Person

@Log
class HelloController {

	def index() {
		def list =[]
		Person person = new Person(firstName:'Koen', lastName:'Van de Weyer', age:44)
		list << person
		list << new Person(firstName: 'John', lastName:'Doe', age:50)
		list << new Person(firstName: 'Jane', lastName:'Smith', age:45)
		list << new Person(firstName: 'Sam', lastName:'Robinson', age:47)
		[list:list]
	}

	def save(Person person) {
		Log .info ${person.firstName}, ${person.age}
	}
	
	def displayForm() {
		// just provide value for age. First Name and Last name are blanks.
		Person person = new Person(age:55)
		[ person:person ]
	}
	
}
