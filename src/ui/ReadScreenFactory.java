package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>ReadScreenFactory</code> implements static methods that return instances of the class <code>{@link ReadScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ReadScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private ReadScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ReadScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ReadScreen createReadScreen() {
		return new ReadScreen(CreatureFactory.createCreature(), 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link ReadScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ReadScreen createReadScreen2() {
		return new ReadScreen(CreatureFactory.createCreature2(), 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link ReadScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ReadScreen createReadScreen3() {
		return new ReadScreen(CreatureFactory.createCreature3(), 7, 7);
	}
}