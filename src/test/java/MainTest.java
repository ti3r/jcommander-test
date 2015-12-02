import org.junit.Before;
import org.junit.Test;

import com.albiworks.tests.jcommander.Main;

public class MainTest {

	
	@Before
	public void init(){
		
	}
	
	@Test
	public void test(){
		Main.main(new String[]{"-n","Alex"});
	}
	
	@Test
	public void testVerbose(){
		Main.main(new String[]{"-n","Alex","-v"});
	}
	
	@Test
	public void testUsage(){
		Main.main(new String[]{"-v"});
	}
	
	@Test
	public void testHola(){
		//TODO check the way of making one parameter optional if one command exists
		Main.main(new String[]{"-n","Alex", "hola", "-n", "You"});
	}
	
	
}
