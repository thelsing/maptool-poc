package net.rptools.maptool.desktop;

import com.badlogic.gdx.backends.jogamp.JoglSwingCanvas;
import net.rptools.maptool.MapToolGdx;
import net.rptools.maptool.desktop.util.Binder;
import net.rptools.maptool.viewmodel.MainViewModel;

import javax.swing.*;
import java.awt.*;

public class MapToolFrame extends JFrame {
  private final MainViewModel viewModel;
  public MapToolFrame(MainViewModel viewModel) {
    this.viewModel = viewModel;
    setSize(800,600);

    var button=new JButton("click");
    add(button, BorderLayout.NORTH);
    Binder.bind(viewModel.getConnectCommand(), button);

    var joglSwingCanvas = new JoglSwingCanvas(new MapToolGdx(), "test", 640, 480);
    var gdxPanel = joglSwingCanvas.getGLCanvas();
    add(gdxPanel, BorderLayout.CENTER);
  }


}
