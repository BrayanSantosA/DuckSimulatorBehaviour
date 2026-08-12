package test;

import duck.MallardDuck;
import duck.RubberDuck;
import duck.DecoyDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		MallardDuck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();

		System.out.println();

		RubberDuck rubber = new RubberDuck();
		rubber.display();
		rubber.performQuack();
		rubber.performFly();

		System.out.println();

		DecoyDuck decoy = new DecoyDuck();
		decoy.display();
		decoy.performQuack();
		decoy.performFly();
	}

}