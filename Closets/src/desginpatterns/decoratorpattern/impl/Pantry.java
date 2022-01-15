package desginpatterns.decoratorpattern.impl;

public class Pantry extends ClosetDecorator {

	public Pantry(Closet type) {
		super(type);
		}
	@Override
	public void develop() {
		super.develop();
		developPantry();
	}
	
	  private void developPantry() {
	        System.out.print("Pantry developed ");
	    }
}
