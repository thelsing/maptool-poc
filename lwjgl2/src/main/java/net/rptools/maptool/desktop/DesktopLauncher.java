package net.rptools.maptool.desktop;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.rptools.maptool.MapTool;

/** Launches the desktop (LWJGL) application. */
public class DesktopLauncher {
	public static void main(String[] args) {
		createApplication();
	}

	private static LwjglApplication createApplication() {
		return new LwjglApplication(new MapTool(), getDefaultConfiguration());
	}

	private static LwjglApplicationConfiguration getDefaultConfiguration() {
		LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
		configuration.title = "maptool";
		configuration.width = MapTool.WIDTH;
		configuration.height = MapTool.HEIGHT;
		//// This prevents a confusing error that would appear after exiting normally.
		configuration.forceExit = false;

		for (int size : new int[] { 128, 64, 32, 16 }) {
			configuration.addIcon("libgdx" + size + ".png", FileType.Internal);
		}
		return configuration;
	}
}