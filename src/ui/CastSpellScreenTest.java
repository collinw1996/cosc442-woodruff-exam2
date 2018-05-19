package ui;

import java.awt.Color;
import game.Tile;
import game.Effect;
import game.Creature;
import game.Spell;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;
import game.CreatureFactory;
import game.SpellFactory;

/**
 * The class <code>CastSpellScreenTest</code> contains tests for the class <code>{@link CastSpellScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:02 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class CastSpellScreenTest {
	/**
	 * Run the CastSpellScreen(Creature,String,int,int,Spell) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:02 AM
	 */
	@Test
	public void testCastSpellScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();
		String caption = "";
		int sx = 1;
		int sy = 1;
		Spell spell = SpellFactory.createSpell();

		CastSpellScreen result = new CastSpellScreen(player, caption, sx, sy, spell);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void selectWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:02 AM
	 */
	@Test
	public void testSelectWorldCoordinate_1()
		throws Exception {
		CastSpellScreen fixture = CastSpellScreenFactory.createCastSpellScreen();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.canSee(Creature.java:345)
		//       at game.Creature.creature(Creature.java:360)
		//       at game.Creature.castSpell(Creature.java:528)
		//       at ui.CastSpellScreen.selectWorldCoordinate(CastSpellScreen.java:15)
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
		new org.junit.runner.JUnitCore().run(CastSpellScreenTest.class);
	}
}