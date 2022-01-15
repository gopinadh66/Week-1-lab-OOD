package desginpatterns.decoratorpattern.impl;

public class DecoratorDemo {

	public static void main(String[] args) {
		Closet[] array = {new Linen(new ClosetType()), new Pantry(new Linen(new ClosetType())),
                new Utility(new Pantry(new Linen(new ClosetType())))};
        for (Closet anArray : array) {
            anArray.develop();
            System.out.print("  ");
        }

	}

}
