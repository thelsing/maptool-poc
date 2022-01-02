package net.rptools.maptool.lib;

import jsinterop.annotations.JsType;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;
import java.util.Set;

public class PropertyChangeSender {
  private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

  public void addPropertyChangeListener(PropertyChangeListener listener) {
    this.pcs.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener listener) {
    this.pcs.removePropertyChangeListener(listener);
  }

  protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
    this.pcs.firePropertyChange(propertyName, oldValue, newValue);
  }
}
