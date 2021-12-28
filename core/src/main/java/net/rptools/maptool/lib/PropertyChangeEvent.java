package net.rptools.maptool.lib;

import jsinterop.annotations.JsType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsType
@Getter @Setter @ToString @AllArgsConstructor
public class PropertyChangeEvent {
  private Object source;
  private String propertyName;
  private Object oldValue;
  private Object newValue;
}
