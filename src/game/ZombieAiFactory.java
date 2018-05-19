package game;



/**
 * The class <code>ZombieAiFactory</code> implements static methods that return instances of the class <code>{@link ZombieAi}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ZombieAiFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private ZombieAiFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ZombieAi}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ZombieAi createZombieAi() {
		return new ZombieAi(CreatureFactory.createCreature(), CreatureFactory.createCreature());
	}


	/**
	 * Create an instance of the class <code>{@link ZombieAi}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ZombieAi createZombieAi2() {
		return new ZombieAi(CreatureFactory.createCreature2(), CreatureFactory.createCreature2());
	}
}