package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>LookScreenFactory</code> implements static methods that return instances of the class <code>{@link LookScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LookScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private LookScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link LookScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static LookScreen createLookScreen() {
		return new LookScreen(CreatureFactory.createCreature(), "", 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link LookScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static LookScreen createLookScreen2() {
		return new LookScreen(CreatureFactory.createCreature2(), "0123456789", 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link LookScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static LookScreen createLookScreen3() {
		return new LookScreen(CreatureFactory.createCreature3(), "An??t-1.0.txt", 7, 7);
	}


	/**
	 * Create an instance of the class <code>{@link LookScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static LookScreen createLookScreen4() {
		return new LookScreen(CreatureFactory.createCreature4(), (String) null, -1, -1);
	}
}