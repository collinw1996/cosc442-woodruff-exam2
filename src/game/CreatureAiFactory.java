package game;

import java.awt.Color;


/**
 * The class <code>CreatureAiFactory</code> implements static methods that return instances of the class <code>{@link CreatureAi}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class CreatureAiFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private CreatureAiFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CreatureAi}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static CreatureAi createCreatureAi() {
		return new CreatureAi(new Creature(new World(new Tile[][][] {{{Tile.BOUNDS}}}), ' ', Color.BLACK, "", 0, 0, 0));
	}
}