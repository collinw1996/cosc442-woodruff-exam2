package game;



/**
 * The class <code>FieldOfViewFactory</code> implements static methods that return instances of the class <code>{@link FieldOfView}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FieldOfViewFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private FieldOfViewFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link FieldOfView}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static FieldOfView createFieldOfView() {
		return new FieldOfView(WorldFactory.createWorld());
	}
}