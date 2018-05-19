package ui;

import org.junit.*;
import game.Creature;
import game.CreatureFactory;
import static org.junit.Assert.*;

/**
 * The class <code>FireWeaponScreenTest</code> contains tests for the class <code>{@link FireWeaponScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:12 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FireWeaponScreenTest {
	/**
	 * Run the FireWeaponScreen(Creature,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testFireWeaponScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();
		int sx = 1;
		int sy = 1;

		FireWeaponScreen result = new FireWeaponScreen(player, sx, sy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
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
		FireWeaponScreen fixture = FireWeaponScreenFactory.createFireWeaponScreen();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen(FireWeaponScreenFactory.java:31)
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
		FireWeaponScreen fixture = FireWeaponScreenFactory.createFireWeaponScreen2();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen2(FireWeaponScreenFactory.java:41)
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
		FireWeaponScreen fixture = FireWeaponScreenFactory.createFireWeaponScreen3();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen3(FireWeaponScreenFactory.java:51)
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
		FireWeaponScreen fixture = FireWeaponScreenFactory.createFireWeaponScreen();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen(FireWeaponScreenFactory.java:31)
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
		FireWeaponScreen fixture = FireWeaponScreenFactory.createFireWeaponScreen2();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen2(FireWeaponScreenFactory.java:41)
	}

	/**
	 * Run the void selectWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testSelectWorldCoordinate_2()
		throws Exception {
		FireWeaponScreen fixture = FireWeaponScreenFactory.createFireWeaponScreen3();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen3(FireWeaponScreenFactory.java:51)
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
		new org.junit.runner.JUnitCore().run(FireWeaponScreenTest.class);
	}
}