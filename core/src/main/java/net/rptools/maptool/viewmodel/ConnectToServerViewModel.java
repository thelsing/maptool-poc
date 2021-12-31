package net.rptools.maptool.viewmodel;

import lombok.Getter;
import net.rptools.maptool.lib.AbstractCommand;
import net.rptools.maptool.lib.Command;
import net.rptools.maptool.lib.PropertyChangeSender;
import net.rptools.maptool.lib.Translator;
import net.rptools.maptool.model.RptoolsServer;

import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class ConnectToServerViewModel extends PropertyChangeSender implements Translator {
  private final static String SERVER_NAME = "serverName";
  private final static String USER_NAME = "userName";
  private static final String PORT = "port";
  private static final String PASSWORD = "password";
  private static final String USE_KEY_FILE = "useKeyFile";
  private static final String USE_WEB_RTC = "useWebRtc";
  private static final String HOST_NAME = "hostName";

  @Getter
  private List<RptoolsServer> rptoolsServers = new LinkedList<>();

  @Getter
  private String serverName;
  public void setServerName(String value) {
    var oldValue = serverName;
    firePropertyChange(SERVER_NAME, oldValue, value);
    serverName = value;
  }

  @Getter
  private String userName;
  public void setUserName(String value) {
    var oldValue = userName;
    firePropertyChange(USER_NAME, oldValue, value);
    userName = value;
  }

  @Getter
  private String password;
  public void setPassword(String value) {
    var oldValue = password;
    firePropertyChange(PASSWORD, oldValue, value);
    password = value;
  }

  @Getter
  private boolean useKeyFile;
  public void setUseKeyFile(boolean value) {
    var oldValue = useKeyFile;
    firePropertyChange(USE_KEY_FILE, oldValue, value);
    useKeyFile = value;
  }

  @Getter
  private boolean useWebRTC;
  public void setUseWebRTC(boolean value) {
    var oldValue = useWebRTC;
    firePropertyChange(USE_WEB_RTC, oldValue, value);
    useWebRTC = value;
  }

  @Getter
  private String hostName;
  public void setHostName(String value) {
    var oldValue = hostName;
    firePropertyChange(HOST_NAME, oldValue, value);
    hostName = value;
  }

  @Getter
  private int port;
  public void setPort(int value) {
    var oldValue = port;
    firePropertyChange(PORT, oldValue, value);
    port = value;
  }

  @Getter
  private Command rescanLocalNetwork = new AbstractCommand() {
    @Override
    public void execute() {

    }
  };

  @Getter
  private Command fetchFromRpToolsNet = new AbstractCommand() {
    @Override
    public void execute() {

    }
  };

  @Getter
  private Command connect = new AbstractCommand() {
    @Override
    public void execute() {

    }
  };

  @Getter
  private Command cancel = new AbstractCommand() {
    @Override
    public void execute() {

    }
  };
}
