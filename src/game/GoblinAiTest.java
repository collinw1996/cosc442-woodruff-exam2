package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GoblinAiTest</code> contains tests for the class <code>{@link GoblinAi}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:12 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class GoblinAiTest {
	/**
	 * Run the GoblinAi(Creature,Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testGoblinAi_1()
		throws Exception {
		Creature creature = CreatureFactory.createCreature();
		Creature player = CreatureFactory.createCreature2();

		GoblinAi result = new GoblinAi(creature, player);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		GoblinAi fixture = GoblinAiFactory.createGoblinAi();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.GoblinAi.onUpdate(GoblinAi.java:20)
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testOnUpdate_2()
		throws Exception {
		GoblinAi fixture = GoblinAiFactory.createGoblinAi2();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.GoblinAi.onUpdate(GoblinAi.java:20)
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testOnUpdate_3()
		throws Exception {
		GoblinAi fixture = GoblinAiFactory.createGoblinAi();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.GoblinAi.onUpdate(GoblinAi.java:20)
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testOnUpdate_4()
		throws Exception {
		GoblinAi fixture = GoblinAiFactory.createGoblinAi2();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.GoblinAi.onUpdate(GoblinAi.java:20)
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testOnUpdate_5()
		throws Exception {
		GoblinAi fixture = GoblinAiFactory.createGoblinAi();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.GoblinAi.onUpdate(GoblinAi.java:20)
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testOnUpdate_6()
		throws Exception {
		GoblinAi fixture = GoblinAiFactory.createGoblinAi2();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.GoblinAi.onUpdate(GoblinAi.java:20)
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
		new org.junit.runner.JUnitCore().run(GoblinAiTest.class);
	}
}