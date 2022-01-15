package desginpatterns.decoratorpattern.impl;

public class Utility extends ClosetDecorator {

	public Utility(Closet type) {
		super(type);
		}
	@Override
	public void develop() {
		super.develop();
		developUtility();
	}
	  private void developUtility() {
	        System.out.print(" Utility developed");
	    }
}
