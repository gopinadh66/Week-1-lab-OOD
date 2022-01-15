package designpatterns.observerpattern.impl;

import java.util.Scanner;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject sub = new Subject();
        
        new Walkin(sub);
        new Reachin(sub);
        new Wardrobe(sub);
        sub.setState(3);
		

	}

}
