package ui;

import java.awt.Component;
import game.Creature;
import game.CreatureFactory;
import asciiPanel.AsciiPanel;
import game.Spell;
import game.ItemFactory;
import java.awt.event.KeyEvent;
import org.junit.*;
import game.Item;
import game.SpellFactory;
import game.AppletMain;
import static org.junit.Assert.*;

/**
 * The class <code>ReadSpellScreenTest</code> contains tests for the class <code>{@link ReadSpellScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:12 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ReadSpellScreenTest {
	/**
	 * Run the ReadSpellScreen(Creature,int,int,Item) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testReadSpellScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();
		int sx = 1;
		int sy = 1;
		Item item = ItemFactory.createItem();

		ReadSpellScreen result = new ReadSpellScreen(player, sx, sy, item);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testDisplayOutput_2()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen2();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testDisplayOutput_3()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen3();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testDisplayOutput_4()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen4();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen2();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testRespondToUserInput_3()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen3();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testRespondToUserInput_4()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen4();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen use(Spell) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testUse_1()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen();
		Spell spell = SpellFactory.createSpell();

		Screen result = fixture.use(spell);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Screen use(Spell) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	@Test
	public void testUse_2()
		throws Exception {
		ReadSpellScreen fixture = ReadSpellScreenFactory.createReadSpellScreen2();
		Spell spell = SpellFactory.createSpell2();

		Screen result = fixture.use(spell);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Effect.<init>(Effect.java:13)
		//       at game.EffectFactory.createEffect2(EffectFactory.java:39)
		//       at game.SpellFactory.createSpell2(SpellFactory.java:39)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
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
	 * @generatedBy CodePro at 5/19/18 11:12 AM
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
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReadSpellScreenTest.class);
	}
}