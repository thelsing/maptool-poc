package net.rptools.maptool.lib;

import jsinterop.annotations.JsType;
import lombok.NonNull;

import java.beans.PropertyChangeListener;

public interface Command {
  boolean isAvailable();
  String getName();
  void execute();
  String NAME = "Name";
  String AVAILABLE = "Available";
  void addPropertyChangeListener(@NonNull PropertyChangeListener listener);
 // void addPropertyChangeListener(@NonNull String propertyName, @NonNull PropertyChangeListener listener);
  void removePropertyChangeListener(@NonNull PropertyChangeListener listener);
}
