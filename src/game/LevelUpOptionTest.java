package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LevelUpOptionTest</code> contains tests for the class <code>{@link LevelUpOption}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:03 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LevelUpOptionTest {
	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testName_1()
		throws Exception {
		LevelUpOption fixture = LevelUpOptionFactory.createLevelUpOption();

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:556)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LevelUpOptionTest.class);
	}
}