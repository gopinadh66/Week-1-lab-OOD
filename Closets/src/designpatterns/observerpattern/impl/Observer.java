package designpatterns.observerpattern.impl;

public abstract class Observer {
	
	protected Subject subject;
    public abstract void update();
}
