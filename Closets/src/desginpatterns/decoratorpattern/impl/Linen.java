package desginpatterns.decoratorpattern.impl;

public class Linen extends ClosetDecorator {

	public Linen(Closet type) {
		super(type);
		}
	@Override
	public void develop() {
		super.develop();
		developLinen();
	}
	
	  private void developLinen() {
	        System.out.print("Linen developed ");
	    }
}
