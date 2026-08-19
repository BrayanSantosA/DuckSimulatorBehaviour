package test;

import duck.DecoyDuck;
import flybehaviour.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		DecoyDuck decoy = new DecoyDuck();
		decoy.display();

		System.out.println(" Comportamiento inicial");
		decoy.performQuack();
		decoy.performFly();

		decoy.setFlyBehaviour(new FlyRocketPowered());

		System.out.println(" Comportamiento nuevo (rocket) ");
		decoy.performQuack();
		decoy.performFly();
	}

}