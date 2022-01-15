package designpatterns.observerpattern.impl;

public class Walkin extends Observer{

	
	public Walkin(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }

	@Override
	public void update() {
		System.out.println("walk in closet needs a larger area to make");
		
	}

}
