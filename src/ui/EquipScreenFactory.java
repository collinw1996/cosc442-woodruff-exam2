package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>EquipScreenFactory</code> implements static methods that return instances of the class <code>{@link EquipScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class EquipScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private EquipScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link EquipScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static EquipScreen createEquipScreen() {
		return new EquipScreen(CreatureFactory.createCreature());
	}
}