package desginpatterns.decoratorpattern.impl;

public abstract class ClosetDecorator implements Closet{
	private Closet wood;
	
	public ClosetDecorator(Closet type) {
		wood = type;
	}
	@Override
	public void develop() {
		wood.develop();
		
	}
}
