package ui;

import org.junit.*;
import game.Creature;
import game.CreatureFactory;
import game.Item;
import game.ItemFactory;
import static org.junit.Assert.*;

/**
 * The class <code>DropScreenTest</code> contains tests for the class <code>{@link DropScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:02 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class DropScreenTest {
	/**
	 * Run the DropScreen(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:02 AM
	 */
	@Test
	public void testDropScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();

		DropScreen result = new DropScreen(player);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVerb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:02 AM
	 */
	@Test
	public void testGetVerb_1()
		throws Exception {
		DropScreen fixture = DropScreenFactory.createDropScreen();

		String result = fixture.getVerb();

		// add additional test code here
		assertEquals("drop", result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:02 AM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		DropScreen fixture = DropScreenFactory.createDropScreen();
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
	 * @generatedBy CodePro at 5/19/18 11:02 AM
	 */
	@Test
	public void testUse_1()
		throws Exception {
		DropScreen fixture = DropScreenFactory.createDropScreen();
		Item item = ItemFactory.createItem2();

		Screen result = fixture.use(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at game.Creature.drop(Creature.java:384)
		//       at ui.DropScreen.use(DropScreen.java:24)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:02 AM
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
	 * @generatedBy CodePro at 5/19/18 11:02 AM
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
	 * @generatedBy CodePro at 5/19/18 11:02 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DropScreenTest.class);
	}
}