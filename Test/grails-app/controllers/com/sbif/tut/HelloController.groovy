package com.sbif.tut

import groovy.util.logging.Log

import org.springframework.stereotype.Controller

import com.sbif.tut.domain.Person2

@Log
//@Controller
class HelloController {

	def index() {
		def list =[]
		Person2 person = new Person2(firstName:'Koen', lastName:'Van de Weyer', age:44)
		list << person
//		list << new Person(firstName: 'John', lastName:'Doe', age:50)
//		list << new Person(firstName: 'Jane', lastName:'Smith', age:45)
//		list << new Person(firstName: 'Sam', lastName:'Robinson', age:47)
		[list:list]
//		[person:person]
	}

	def save(Person2 person) {
		Log .info ${person.firstName}, ${person.age}
	}
	
	def displayForm() {
		// just provide value for age. First Name and Last name are blanks.
		Person2 person = new Person2(age:55)
		[ person:person ]
	}
	
}
