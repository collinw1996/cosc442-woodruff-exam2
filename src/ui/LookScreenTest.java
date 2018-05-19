package ui;

import java.awt.Color;
import game.Tile;
import game.Creature;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;
import game.CreatureFactory;

/**
 * The class <code>LookScreenTest</code> contains tests for the class <code>{@link LookScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:12 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LookScreenTest {
	/**
	 * Run the LookScreen(Creature,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testLookScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();
		String caption = "";
		int sx = 1;
		int sy = 1;

		LookScreen result = new LookScreen(player, caption, sx, sy);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void enterWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testEnterWorldCoordinate_1()
		throws Exception {
		LookScreen fixture = LookScreenFactory.createLookScreen();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.enterWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.canSee(Creature.java:345)
		//       at game.Creature.creature(Creature.java:360)
		//       at ui.LookScreen.enterWorldCoordinate(LookScreen.java:14)
	}

	/**
	 * Run the void enterWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testEnterWorldCoordinate_2()
		throws Exception {
		LookScreen fixture = LookScreenFactory.createLookScreen2();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.enterWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.canSee(Creature.java:345)
		//       at game.Creature.creature(Creature.java:360)
		//       at ui.LookScreen.enterWorldCoordinate(LookScreen.java:14)
	}

	/**
	 * Run the void enterWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testEnterWorldCoordinate_3()
		throws Exception {
		LookScreen fixture = LookScreenFactory.createLookScreen3();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.enterWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.canSee(Creature.java:345)
		//       at game.Creature.creature(Creature.java:360)
		//       at ui.LookScreen.enterWorldCoordinate(LookScreen.java:14)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LookScreenTest.class);
	}
}