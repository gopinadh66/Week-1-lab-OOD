package designpatterns.observerpattern.impl;

public class Wardrobe extends Observer{

	public Wardrobe(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }
	
	@Override
	public void update() {
		System.out.println("They are the popped-up reach-in closet.");
		
	}

}
