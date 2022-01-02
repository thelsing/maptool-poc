package net.rptools.maptool.lib;

import java.beans.PropertyChangeListener;

public interface Command {
  boolean isAvailable();
  void execute();
  String AVAILABLE = "available";
  void addPropertyChangeListener(PropertyChangeListener listener);
  void removePropertyChangeListener( PropertyChangeListener listener);
}
