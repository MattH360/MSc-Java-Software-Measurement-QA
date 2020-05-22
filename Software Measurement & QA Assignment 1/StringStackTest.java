package Testing;
import org.junit.Assert;
import org.junit.Test;

public class StringStackTest {

	@Test
	public void testPopValid() {
		/*(ELSE Branch)
		 * Enter strings to pop from the stack, pop strings from the sack
		 * Check that in each case that the first pop is the top string2 and the next is string1 (First In Last Out)
		 * Check stack is empty
		 */
		StringStack popTestValid = new StringStack();
		popTestValid.push("string1");
		popTestValid.push("string2");
		String s1 = popTestValid.pop();
		Assert.assertEquals(s1, "string2");
		System.out.println("(popTestValid) s1 = " + s1);
		String s2 = popTestValid.pop();
		Assert.assertEquals(s2, "string1");
		System.out.println("(popTestValid) s2 = " + s2);
		Assert.assertTrue(popTestValid.isEmpty());
		System.out.println("(popTestValid) Stack Empty: " + popTestValid.isEmpty());
	}
	
	@Test
	public void testPopInValid() {
		/*(IF Branch)
		 * Check that the stack is empty and try to pop from an empty stack
		 * Catch and print the error message
		 */
		StringStack popTestInValid = new StringStack();
		
		try {
			Assert.assertTrue(popTestInValid.isEmpty());
			System.out.println("(popTestInvalid) Stack Empty: " + popTestInValid.isEmpty());
			popTestInValid.pop();
		}
		catch (Exception e) {
			System.out.println("(popTestInvalid) Error Message: " + e.getMessage());
		}
	}
	
	@Test
	public void testPushValid() {
		/*(ELSE Branch)
		 * Enter Strings and check that they are present in the stack
		 */
		StringStack pushTestValid = new StringStack();
		
		pushTestValid.push("string0");
		pushTestValid.push("string1");
		Assert.assertFalse(pushTestValid.isEmpty()); 
		System.out.println("(pushTestValid) Stack Empty: " + pushTestValid.isEmpty());
		
	}

	
	@Test
	public void testPushInValid() {
		/*(IF Branch)
		 * Enter Strings up to capacity and check that they are present in the stack
		 *Try to push an extra string into the stack to exceed capacity
		 *(if statement is actually 0-9 Stack capacity so String10 should exceed capacity)
		 * Catch and print error message 
		 */
		StringStack pushTestInValid = new StringStack();
		
		try {
		pushTestInValid.push("string0");
		pushTestInValid.push("string1");
		pushTestInValid.push("string2");
		pushTestInValid.push("string3");
		pushTestInValid.push("string4"); 
		pushTestInValid.push("string5");
		pushTestInValid.push("string6");
		pushTestInValid.push("string7");
		pushTestInValid.push("string8");
		pushTestInValid.push("string9");
		Assert.assertFalse(pushTestInValid.isEmpty()); 
		System.out.println("(pushTestInvalid) Stack Empty: " + pushTestInValid.isEmpty());
		pushTestInValid.push("string10");
		}
		catch (Exception e) {
			System.out.println("(pushTestInvalid) Error Message: " + e.getMessage());
		}
	}

	@Test
	public void testIsEmptyValid() {
		//(True branch)
		//Check that the new stack is empty (This should be true as it has just been created)
		 
		StringStack emptyTestValid = new StringStack();
		Assert.assertTrue(emptyTestValid.isEmpty());
		System.out.println("(emptyTestValid) Stack Empty: " + emptyTestValid.isEmpty());	
	}
	
	@Test
	public void testIsEmptyInvalid() {
		//(False branch)
		//Push a new string1 to the stack (expecting stack not to be empty and print empty test result)
		StringStack emptyTestInvalid = new StringStack();
		emptyTestInvalid.push("string1");
		Assert.assertFalse(emptyTestInvalid.isEmpty());
		System.out.println("(emptyTestInValid) Stack Empty: " + emptyTestInvalid.isEmpty());
		
	}
	

}
