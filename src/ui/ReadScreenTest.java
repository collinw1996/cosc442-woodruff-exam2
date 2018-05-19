package ui;

import org.junit.*;
import game.Creature;
import game.CreatureFactory;
import game.Item;
import game.ItemFactory;
import static org.junit.Assert.*;

/**
 * The class <code>ReadScreenTest</code> contains tests for the class <code>{@link ReadScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:10 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ReadScreenTest {
	/**
	 * Run the ReadScreen(Creature,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testReadScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();
		int sx = 1;
		int sy = 1;

		ReadScreen result = new ReadScreen(player, sx, sy);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVerb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testGetVerb_1()
		throws Exception {
		ReadScreen fixture = ReadScreenFactory.createReadScreen();

		String result = fixture.getVerb();

		// add additional test code here
		assertEquals("read", result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		ReadScreen fixture = ReadScreenFactory.createReadScreen2();
		Item item = ItemFactory.createItem();

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testIsAcceptable_2()
		throws Exception {
		ReadScreen fixture = ReadScreenFactory.createReadScreen3();
		Item item = ItemFactory.createItem2();

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Screen use(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testUse_1()
		throws Exception {
		ReadScreen fixture = ReadScreenFactory.createReadScreen();
		Item item = ItemFactory.createItem3();

		Screen result = fixture.use(item);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReadScreenTest.class);
	}
}