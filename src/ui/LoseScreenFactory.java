package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>LoseScreenFactory</code> implements static methods that return instances of the class <code>{@link LoseScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LoseScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private LoseScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link LoseScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static LoseScreen createLoseScreen() {
		return new LoseScreen(CreatureFactory.createCreature());
	}
}