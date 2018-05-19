package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>QuaffScreenFactory</code> implements static methods that return instances of the class <code>{@link QuaffScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class QuaffScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private QuaffScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link QuaffScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static QuaffScreen createQuaffScreen() {
		return new QuaffScreen(CreatureFactory.createCreature());
	}
}