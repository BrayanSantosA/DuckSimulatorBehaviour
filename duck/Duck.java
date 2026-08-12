package duck;

import flybehaviour.FlyBehaviour;
import quackbehaviour.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}

	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}

	public abstract void display();

}