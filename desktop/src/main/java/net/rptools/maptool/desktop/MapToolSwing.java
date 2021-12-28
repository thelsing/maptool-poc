package net.rptools.maptool.desktop;

import net.rptools.maptool.viewmodel.MainViewModel;

public class MapToolSwing {
  public static void main(String[] args) {
    var frame=new MapToolFrame(new MainViewModel());
    frame.setVisible(true);//making the frame visible
  }
}
