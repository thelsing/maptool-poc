package net.rptools.maptool.viewmodel;

import net.rptools.maptool.lib.AbstractCommand;
import net.rptools.maptool.lib.Command;
import net.rptools.maptool.lib.PropertyChangeSender;

public class MainViewModel extends PropertyChangeSender {
  private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MainViewModel.class);
  private static final String CONNECT_DIALOG_OPEN = "connectDialogOpen";

  private Command connectCommand = new AbstractCommand() {
    @Override
    public void execute() {
      log.info("test");
      setConnectDialogOpen(!isConnectDialogOpen());
    }
  };
  public Command getConnectCommand() { return connectCommand; }

  private boolean connectDialogOpen;
  public boolean isConnectDialogOpen() { return connectDialogOpen; }
  public void setConnectDialogOpen(boolean value) {
    var oldValue = connectDialogOpen;
    firePropertyChange(CONNECT_DIALOG_OPEN, oldValue, value);
    connectDialogOpen = value;
  }
}
