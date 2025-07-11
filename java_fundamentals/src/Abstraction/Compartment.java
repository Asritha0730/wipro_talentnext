package Abstraction;

public abstract class Compartment {
	
	public abstract String notice();
}

class FirstClass extends Compartment{

	@Override
	public String notice() {
		return "First class Compartment";
	}
	
}
class Ladies extends Compartment{
	public String notice() {
		return "Ladies class Compartment";
	}
}
class General extends Compartment{
	public String notice() {
		return "General Class Compartment";
	}
}
class Lugguage extends Compartment{
	public String notice() {
		return "Lugguage Class Compartment";
	}
}
