import org.junit.BeforeClass;
import org.junit.Test;

import com.singtel.designapp.Bird;

import junit.framework.Assert;

public class BirdTest {
	
	static Bird bird;
	
	@BeforeClass
	 static public void startup(){
		bird = new Bird();
	}
	
	@Test
	public void testBirdSingingSuccess(){
		Assert.assertEquals("I am Singing", bird.sing());
	}

}
