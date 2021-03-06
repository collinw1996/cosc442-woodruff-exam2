package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BatAiTest</code> contains tests for the class <code>{@link BatAi}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:03 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class BatAiTest {
	/**
	 * Run the BatAi(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testBatAi_1()
		throws Exception {
		Creature creature = CreatureFactory.createCreature();

		BatAi result = new BatAi(creature);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		BatAi fixture = BatAiFactory.createBatAi();

		fixture.onUpdate();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(BatAiTest.class);
	}
}