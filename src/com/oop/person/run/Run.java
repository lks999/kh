package com.oop.person.run;

import com.oop.person.controller.PersonController;

public class Run {
	
	public static void main(String[] args) {
		PersonController person = new PersonController();
		person.inputPersons();
		person.printPersons();
		person.avePersons();
	}

}
