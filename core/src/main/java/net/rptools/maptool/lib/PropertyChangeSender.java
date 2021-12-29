package net.rptools.maptool.lib;

import jsinterop.annotations.JsType;
import lombok.NonNull;
import lombok.Synchronized;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;
import java.util.Set;

public class PropertyChangeSender {
  private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

  public void addPropertyChangeListener(@NonNull PropertyChangeListener listener) {
    this.pcs.addPropertyChangeListener(listener);
  }

  /*public void addPropertyChangeListener(@NonNull String propertyName, @NonNull PropertyChangeListener listener) {
    this.pcs.addPropertyChangeListener(propertyName, listener);
  }*/

  public void removePropertyChangeListener(@NonNull PropertyChangeListener listener) {
    this.pcs.removePropertyChangeListener(listener);
  }
  @Synchronized
  protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
    this.pcs.firePropertyChange(propertyName, oldValue, newValue);
  }
}
