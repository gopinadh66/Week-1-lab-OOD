package designpatterns.observerpattern.impl;

public class Reachin extends Observer{

	public Reachin(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }
	
	@Override
	public void update() {
		System.out.println("The reach-in closet style is organized by shallow depth.");
		
	}

}
