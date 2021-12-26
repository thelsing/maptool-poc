package net.rptools.maptool;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.github.czyzby.kiwi.util.gdx.AbstractApplicationListener;
import com.github.czyzby.kiwi.util.gdx.asset.Disposables;
import com.github.czyzby.kiwi.util.gdx.scene2d.Actors;
import com.github.czyzby.kiwi.util.gdx.viewport.Viewports;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class MapTool extends AbstractApplicationListener {
	/** Default application size. */
	public static final int WIDTH = 640, HEIGHT = 480;

	private Stage stage;
	private Texture texture;
	private Image image;

	@Override
	public void create() {
		stage = new Stage();
		texture = new Texture("libgdx.png");
		image = new Image(texture);
		stage.addActor(image);
		Actors.centerActor(image);
	}

	@Override
	public void resize(int width, int height) {
		Viewports.update(stage);
		Actors.centerActor(image);
	}

	@Override
	public void render(float deltaTime) {
		// AbstractApplicationListener automatically clears the screen with black color.
		stage.act(deltaTime);
		stage.draw();
	}

	@Override
	public void dispose() {
		// Null-safe disposing utility method:
		Disposables.disposeOf(stage, texture);
	}
}