package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>ExamineScreenFactory</code> implements static methods that return instances of the class <code>{@link ExamineScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ExamineScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private ExamineScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ExamineScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ExamineScreen createExamineScreen() {
		return new ExamineScreen(CreatureFactory.createCreature());
	}
}