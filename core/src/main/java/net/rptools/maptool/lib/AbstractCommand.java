package net.rptools.maptool.lib;

public abstract class AbstractCommand extends PropertyChangeSender implements Command {
  private boolean available = true;

  public boolean isAvailable() { return available; }
  protected void setAvailable(boolean value) {
    var old = available;
    available = value;
    firePropertyChange(Command.AVAILABLE, old, value);
  }
}
