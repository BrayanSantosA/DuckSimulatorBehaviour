package duck;

import flybehaviour.FlyWithWings;
import quackbehaviour.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	public void display() {
		System.out.println("I'm a  Mallard duck");
	}

}