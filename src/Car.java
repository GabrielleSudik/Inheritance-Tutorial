
public class Car extends Machine {
	
	//see new keyword EXTENDS
	//that means Car inherits from Machine.
	//up till here, Car is the same as Machine.
	//starting from here, everything is specific to Car.
	
	public void wipeWindshield() {
		System.out.println("Wiping the windshield");
	}
	
	//you can override methods from the parent class:
	public void Start() {
		System.out.println("Car started.");
	}
	//main calls THIS method instead of Machine's.
	//it still calls Machine's Stop though
	//because that isn't overriden.

	//groovy: RIGHT CLICK on white space in this class
	//from menu, choose Source -- Override...
	//and you can choose methods from Machine to override here
	//it produces the following text:
	
	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("Car is stopped."); //that's my line
		super.Stop();
		//the last line also calls the parent method.
		
		//that @Override is an annotation to eclipse:
		//it makes the program check that what follows is an override.
		//so if you have a typo or something, it will catch it.
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
	
}
