package Testing;

public class StringStack {
	private int capacity = 10; 
	private int pointer = 0; //Mutant1 (change pointer = 0 to pointer = 10) Killed by testPopInValid(), testIsEmptyValid()
	private String[] objects = new String[capacity];

	public void push(String o) {
		if (pointer >= capacity) 
			throw new IllegalArgumentException("Stack exceeded capacity!");
		objects[pointer++] = o; //Mutant2 (change pointer++ to pointer--) Killed by testIsEmptyInValid()
	}

	public String pop() {
		if (pointer <= 0) 
			throw new IllegalArgumentException("Stack empty");
		return objects[--pointer]; //Mutant3 (change --pointer to ++pointer) Killed by testPopValid()
	}

	public boolean isEmpty() {
		return pointer <= 0;  //Mutant4 (change pointer <= 0 to pointer < 0) Killed by testPopInValid(), testPopValid(), testIsEmptyValid()
							 //Mutant5 (change pointer <= 0 to pointer > 0) Killed by testIsEmptyInValid(), testPushValid(), testPushInValid(), testPopInValid(), testPopValid(), testIsEmptyValid()
							 //Mutant6 (change pointer <= 0 to pointer != 0) Killed by testIsEmptyInValid(), testPushValid(), testPushInValid(), testPopInValid(), testPopValid(), testIsEmptyValid()
	}						
}