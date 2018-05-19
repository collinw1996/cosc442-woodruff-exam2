package game;

import java.awt.Color;


/**
 * The class <code>GoblinAiFactory</code> implements static methods that return instances of the class <code>{@link GoblinAi}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class GoblinAiFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private GoblinAiFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link GoblinAi}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static GoblinAi createGoblinAi() {
		return new GoblinAi(new Creature(WorldFactory.createWorld(), ' ', Color.BLACK, "", 0, 0, 0), new Creature(WorldFactory.createWorld(), ' ', Color.BLACK, "", 0, 0, 0));
	}


	/**
	 * Create an instance of the class <code>{@link GoblinAi}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static GoblinAi createGoblinAi2() {
		return new GoblinAi(new Creature(WorldFactory.createWorld(), '\n', Color.LIGHT_GRAY, "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE), new Creature(WorldFactory.createWorld(), '\n', Color.LIGHT_GRAY, "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
	}
}