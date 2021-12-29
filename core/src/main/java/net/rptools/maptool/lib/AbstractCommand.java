package net.rptools.maptool.lib;

import jsinterop.annotations.JsType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractCommand extends PropertyChangeSender implements Command {
  @Getter
  private boolean available = true;
  @NonNull
  @Getter
  private String name;

  protected void setName(String value) {
    var old = name;
    name = value;
    firePropertyChange(Command.NAME,  old, name);
  }

  protected void setAvailable(boolean value) {
    var old = available;
    available = value;
    firePropertyChange(Command.AVAILABLE, old, value);
  }
}
