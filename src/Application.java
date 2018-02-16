
public class Application {
	
	public static void main(String[] args) {
		Machine mech1 =	new Machine();
		
		mech1.Start();
		mech1.Stop();
		
		Car car1 = new Car();
		
		car1.Start();
		car1.wipeWindshield();
		car1.Stop();
		car1.showInfo();
	}

}

//note the new class is now in its own file.
//create it the same way you create the application class.