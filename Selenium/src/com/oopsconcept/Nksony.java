package com.oopsconcept;

public class Nksony extends Ketaki {
	


	public static void main(String[] args) {
		//Scenario Parent objetc reference
		//Ketaki k = new Ketaki();
		//k.myDaufgter();
		
		//Scenario Child class  reference call parent method 
		Nksony nk = new Nksony();
		nk.myDaufgter();

		//Scenario Child class  reference call parent method 
		
		Ketaki k2 =  new Nksony();
	}

}
