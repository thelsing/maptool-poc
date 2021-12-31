package net.rptools.maptool.lib;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractCommand extends PropertyChangeSender implements Command {
  @Getter
  @JsProperty
  private boolean available = true;

  protected void setAvailable(boolean value) {
    var old = available;
    available = value;
    firePropertyChange(Command.AVAILABLE, old, value);
  }
}
