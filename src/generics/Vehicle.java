package generics;

import java.util.Arrays;

/*
   1. Vehicle
   2. 4 tiers
   3. Engine
*/
class Vehicle {
	public static final int NUMBER_OF_TIERS = 4;
	Tire[] tires;
	Engine engine;

	public Vehicle(Engine engine) {
		tires = new Tire[NUMBER_OF_TIERS];
	}

	public Vehicle(Engine engine, Tire[] tiers) {
		tiers = new Tire[NUMBER_OF_TIERS];
		this.tires = tiers;
	}

	void startEngine() {
		engine.start();
	}

	void stopEngine() {
		engine.stop();
	}

	public void setTiers(Tire[] tiers) {
		this.tires = tiers;
	}

	@Override
	public String toString() {
		return "Vehicle [tires=" + Arrays.toString(tires) + ", engine=" + engine + "]";
	}
	
	
}

class Tire {
	String color;
}

class Engine {
	void start() {
	}

	void stop() {
	}
}
