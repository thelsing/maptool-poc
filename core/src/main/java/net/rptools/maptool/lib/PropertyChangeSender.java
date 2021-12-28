package net.rptools.maptool.lib;

import jsinterop.annotations.JsType;
import lombok.NonNull;
import lombok.Synchronized;

import java.util.HashSet;
import java.util.Set;

@JsType
public class PropertyChangeSender {
  private final Set<PropertyChangeListener> listeners = new HashSet<>();
  @Synchronized
  public void addPropertyChangeListener(@NonNull PropertyChangeListener listener) {
    listeners.add(listener);
  }
  @Synchronized
  public void removePropertyChangeListener(@NonNull PropertyChangeListener listener) {
    listeners.remove(listener);
  }

  @Synchronized
  protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
    for(var listener : listeners)
      listener.propertyChange(new PropertyChangeEvent(this, propertyName, oldValue, newValue));
  }
}
