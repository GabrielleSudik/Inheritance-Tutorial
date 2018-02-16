
public class Machine {
	
	public void Start() {
		System.out.println("Machine started.");
	}

	public void Stop() {
		System.out.println("Machine is stopped.");
	}
	
	//private stuff in the parents class WON'T pass on to the child
	//because it's private to this class only
	//private String name = "I'm Fancy Machine!";
	
	//instead, don't use private.use protected
	protected String name = "I'm Silly Machine.";
	//more on this in a future lesson
}
