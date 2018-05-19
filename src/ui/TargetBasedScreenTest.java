package ui;

import java.awt.Component;
import java.awt.event.KeyEvent;
import org.junit.*;
import asciiPanel.AsciiPanel;
import game.AppletMain;
import static org.junit.Assert.*;

/**
 * The class <code>TargetBasedScreenTest</code> contains tests for the class <code>{@link TargetBasedScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:10 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TargetBasedScreenTest {
	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testDisplayOutput_2()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen2();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Effect.<init>(Effect.java:13)
		//       at game.EffectFactory.createEffect2(EffectFactory.java:39)
		//       at game.SpellFactory.createSpell2(SpellFactory.java:39)
		//       at ui.CastSpellScreenFactory.createCastSpellScreen2(CastSpellScreenFactory.java:43)
		//       at ui.TargetBasedScreenFactory.createcreateCastSpellScreen2(TargetBasedScreenFactory.java:39)
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testDisplayOutput_3()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen3();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testDisplayOutput_4()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen4();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testDisplayOutput_5()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen5();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testDisplayOutput_6()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateFireWeaponScreen();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen(FireWeaponScreenFactory.java:31)
		//       at ui.TargetBasedScreenFactory.createcreateFireWeaponScreen(TargetBasedScreenFactory.java:79)
	}

	/**
	 * Run the void enterWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testEnterWorldCoordinate_1()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateFireWeaponScreen();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.enterWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen(FireWeaponScreenFactory.java:31)
		//       at ui.TargetBasedScreenFactory.createcreateFireWeaponScreen(TargetBasedScreenFactory.java:79)
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen5();
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateFireWeaponScreen2();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen2(FireWeaponScreenFactory.java:41)
		//       at ui.TargetBasedScreenFactory.createcreateFireWeaponScreen2(TargetBasedScreenFactory.java:89)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateFireWeaponScreen3();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen3(FireWeaponScreenFactory.java:51)
		//       at ui.TargetBasedScreenFactory.createcreateFireWeaponScreen3(TargetBasedScreenFactory.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_3()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateLookScreen();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_4()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateLookScreen2();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_5()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateLookScreen3();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_6()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateLookScreen4();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_7()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateThrowAtScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen(ThrowAtScreenFactory.java:33)
		//       at ui.TargetBasedScreenFactory.createcreateThrowAtScreen(TargetBasedScreenFactory.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_8()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateThrowAtScreen2();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen2(ThrowAtScreenFactory.java:43)
		//       at ui.TargetBasedScreenFactory.createcreateThrowAtScreen2(TargetBasedScreenFactory.java:159)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_9()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateThrowAtScreen3();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen3(ThrowAtScreenFactory.java:53)
		//       at ui.TargetBasedScreenFactory.createcreateThrowAtScreen3(TargetBasedScreenFactory.java:169)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_10()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateThrowAtScreen4();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.ThrowAtScreen.<init>(ThrowAtScreen.java:12)
		//       at ui.ThrowAtScreenFactory.createThrowAtScreen4(ThrowAtScreenFactory.java:63)
		//       at ui.TargetBasedScreenFactory.createcreateThrowAtScreen4(TargetBasedScreenFactory.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_11()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_12()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen2();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Effect.<init>(Effect.java:13)
		//       at game.EffectFactory.createEffect2(EffectFactory.java:39)
		//       at game.SpellFactory.createSpell2(SpellFactory.java:39)
		//       at ui.CastSpellScreenFactory.createCastSpellScreen2(CastSpellScreenFactory.java:43)
		//       at ui.TargetBasedScreenFactory.createcreateCastSpellScreen2(TargetBasedScreenFactory.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_13()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen3();
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testRespondToUserInput_14()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateCastSpellScreen4();
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
	 * Run the void selectWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	@Test
	public void testSelectWorldCoordinate_1()
		throws Exception {
		TargetBasedScreen fixture = TargetBasedScreenFactory.createcreateFireWeaponScreen2();
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at ui.FireWeaponScreen.<init>(FireWeaponScreen.java:10)
		//       at ui.FireWeaponScreenFactory.createFireWeaponScreen2(FireWeaponScreenFactory.java:41)
		//       at ui.TargetBasedScreenFactory.createcreateFireWeaponScreen2(TargetBasedScreenFactory.java:89)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:10 AM
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
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
	 * @generatedBy CodePro at 5/19/18 11:10 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TargetBasedScreenTest.class);
	}
}