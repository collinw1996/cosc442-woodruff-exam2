package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>DropScreenFactory</code> implements static methods that return instances of the class <code>{@link DropScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class DropScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private DropScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DropScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static DropScreen createDropScreen() {
		return new DropScreen(CreatureFactory.createCreature());
	}
}