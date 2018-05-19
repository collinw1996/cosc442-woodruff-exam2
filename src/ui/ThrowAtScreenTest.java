package ui;

import org.junit.*;
import game.Creature;
import game.CreatureFactory;
import game.Item;
import game.ItemFactory;
import static org.junit.Assert.*;

/**
 * The class <code>ThrowAtScreenTest</code> contains tests for the class <code>{@link ThrowAtScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:12 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ThrowAtScreenTest {
	/**
	 * Run the ThrowAtScreen(Creature,int,int,Item) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testThrowAtScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();
		int sx = 1;
		int sy = 1;
		Item item = ItemFactory.createItem();

		ThrowAtScreen result = new ThrowAtScreen(player, sx, sy, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		ThrowAtScreen fixture = ThrowAtScreenFactory.createThrowAtScreen();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen(ThrowAtScreenFactory.java:33)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testIsAcceptable_2()
		throws Exception {
		ThrowAtScreen fixture = ThrowAtScreenFactory.createThrowAtScreen2();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen2(ThrowAtScreenFactory.java:43)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testIsAcceptable_3()
		throws Exception {
		ThrowAtScreen fixture = ThrowAtScreenFactory.createThrowAtScreen3();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen3(ThrowAtScreenFactory.java:53)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testIsAcceptable_4()
		throws Exception {
		ThrowAtScreen fixture = ThrowAtScreenFactory.createThrowAtScreen4();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen4(ThrowAtScreenFactory.java:63)
		assertTrue(result);
	}

	/**
	 * Run the void selectWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testSelectWorldCoordinate_1()
		throws Exception {
		ThrowAtScreen fixture = ThrowAtScreenFactory.createThrowAtScreen();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen(ThrowAtScreenFactory.java:33)
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
		new org.junit.runner.JUnitCore().run(ThrowAtScreenTest.class);
	}
}