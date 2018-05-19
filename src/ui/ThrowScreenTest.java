package ui;

import java.awt.Color;
import game.Tile;
import game.Creature;
import game.Item;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;
import game.CreatureFactory;
import game.ItemFactory;

/**
 * The class <code>ThrowScreenTest</code> contains tests for the class <code>{@link ThrowScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:03 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ThrowScreenTest {
	/**
	 * Run the ThrowScreen(Creature,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testThrowScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();
		int sx = 1;
		int sy = 1;

		ThrowScreen result = new ThrowScreen(player, sx, sy);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVerb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testGetVerb_1()
		throws Exception {
		ThrowScreen fixture = ThrowScreenFactory.createThrowScreen();

		String result = fixture.getVerb();

		// add additional test code here
		assertEquals("throw", result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		ThrowScreen fixture = ThrowScreenFactory.createThrowScreen2();
		Item item = ItemFactory.createItem();

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Screen use(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testUse_1()
		throws Exception {
		ThrowScreen fixture = ThrowScreenFactory.createThrowScreen3();
		Item item = ItemFactory.createItem2();

		Screen result = fixture.use(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowScreen.use(ThrowScreen.java:28)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
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
	 * @generatedBy CodePro at 5/19/18 11:03 AM
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
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ThrowScreenTest.class);
	}
}