package com.sbif.tut



import static org.springframework.http.HttpStatus.*

import com.sbif.tut.domain.Passenger;

import grails.transaction.Transactional

@Transactional(readOnly = true)
class PassengerController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index() {
		render 'passenger'
//		def l = Passenger.list()
//		[l:l]
	}

//    def index(Integer max) {
//        params.max = Math.min(max ?: 10, 100)
//        respond Passenger.list(params), model:[passengerInstanceCount: Passenger.count()]
//    }

    def show(Passenger passengerInstance) {
        respond passengerInstance
    }

    def create() {
        respond new Passenger(params)
    }

    @Transactional
    def save(Passenger passengerInstance) {
        if (passengerInstance == null) {
            notFound()
            return
        }

        if (passengerInstance.hasErrors()) {
            respond passengerInstance.errors, view:'create'
            return
        }

        passengerInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'passenger.label', default: 'Passenger'), passengerInstance.id])
                redirect passengerInstance
            }
            '*' { respond passengerInstance, [status: CREATED] }
        }
    }

    def edit(Passenger passengerInstance) {
        respond passengerInstance
    }

    @Transactional
    def update(Passenger passengerInstance) {
        if (passengerInstance == null) {
            notFound()
            return
        }

        if (passengerInstance.hasErrors()) {
            respond passengerInstance.errors, view:'edit'
            return
        }

        passengerInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Passenger.label', default: 'Passenger'), passengerInstance.id])
                redirect passengerInstance
            }
            '*'{ respond passengerInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Passenger passengerInstance) {

        if (passengerInstance == null) {
            notFound()
            return
        }

        passengerInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Passenger.label', default: 'Passenger'), passengerInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'passenger.label', default: 'Passenger'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
