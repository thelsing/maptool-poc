package net.rptools.maptool.lib;

import jsinterop.annotations.JsType;
import lombok.NonNull;

import java.beans.PropertyChangeListener;

public interface Command {
  boolean isAvailable();
  void execute();
  String AVAILABLE = "available";
  void addPropertyChangeListener(@NonNull PropertyChangeListener listener);
  void removePropertyChangeListener(@NonNull PropertyChangeListener listener);
}
