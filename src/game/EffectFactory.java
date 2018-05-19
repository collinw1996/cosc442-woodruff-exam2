package game;



/**
 * The class <code>EffectFactory</code> implements static methods that return instances of the class <code>{@link Effect}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class EffectFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private EffectFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Effect}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static Effect createEffect() {
		return new Effect(0);
	}


	/**
	 * Create an instance of the class <code>{@link Effect}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static Effect createEffect2() {
		return new Effect((Effect) null);
	}
}