package net.rptools.maptool.lib;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsFunction
public interface PropertyChangeListener {
  void propertyChange(PropertyChangeEvent evt);
}
