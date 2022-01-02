package net.rptools.maptool.gwt;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import jsinterop.annotations.JsMethod;
import net.rptools.maptool.MapToolGdx;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 * Launches the GWT application.
 */
public class GwtLauncher extends GwtApplication {
  @JsMethod(namespace = GLOBAL)
  public static native void onGwtReady();

  @Override
  public GwtApplicationConfiguration getConfig() {
    // Resizable application, uses available space in browser with no padding:
    GwtApplicationConfiguration cfg = new GwtApplicationConfiguration(true);
    cfg.padVertical = 100;
    cfg.padHorizontal = 100;
    return cfg;
    // If you want a fixed size application, comment out the above resizable section,
    // and uncomment below:
    //return new GwtApplicationConfiguration(MapTool.WIDTH, MapTool.HEIGHT);
  }

  @Override
  public ApplicationListener createApplicationListener() {
    return new MapToolGdx();
  }

  @Override
  public void onModuleLoad() {
    VueGWT.init();
    Vue.attach("#mainComponentContainer", MainComponentFactory.get());
    super.onModuleLoad();
    onGwtReady();
  }
}
