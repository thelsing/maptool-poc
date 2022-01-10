package net.rptools.maptool.viewmodel;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import net.rptools.maptool.lib.AbstractCommand;
import net.rptools.maptool.lib.Command;
import net.rptools.maptool.lib.PropertyChangeSender;
import net.rptools.maptool.model.RptoolsServer;

import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class ConnectToServerViewModel extends PropertyChangeSender {
  private static final String SERVER_NAME = "serverName";
  private static final String USER_NAME = "userName";
  private static final String PORT = "port";
  private static final String PASSWORD = "password";
  private static final String USE_KEY_FILE = "useKeyFile";
  private static final String USE_WEB_RTC = "useWebRtc";
  private static final String HOST_NAME = "hostName";

  @SuppressWarnings("vue-gwt-collections")
  private List<RptoolsServer> rptoolsServers = new LinkedList<>();
  @JsProperty
  public List<RptoolsServer> getRptoolsServers() { return rptoolsServers; }

  @SuppressWarnings("vue-gwt-collections")
  private List<String> lanServers = new LinkedList<>();
  @JsProperty
  public List<String> getLanServers() { return lanServers; }

  private String serverName;
  public String getServerName() { return serverName; }
  public void setServerName(String value) {
    var oldValue = serverName;
    firePropertyChange(SERVER_NAME, oldValue, value);
    serverName = value;
  }

  private String userName;
  public String getUserName() { return userName; }
  public void setUserName(String value) {
    var oldValue = userName;
    firePropertyChange(USER_NAME, oldValue, value);
    userName = value;
  }

  private String password;
  public String getPassword() { return password; }
  public void setPassword(String value) {
    var oldValue = password;
    firePropertyChange(PASSWORD, oldValue, value);
    password = value;
  }

  private boolean useKeyFile;
  public boolean isUseKeyFile() { return useKeyFile; }
  public void setUseKeyFile(boolean value) {
    var oldValue = useKeyFile;
    firePropertyChange(USE_KEY_FILE, oldValue, value);
    useKeyFile = value;
  }

  private boolean useWebRTC;
  public boolean isUseWebRTC() { return useWebRTC; }
  public void setUseWebRTC(boolean value) {
    var oldValue = useWebRTC;
    firePropertyChange(USE_WEB_RTC, oldValue, value);
    useWebRTC = value;
  }

  private String hostName;
  public String getHostName() { return hostName; }
  public void setHostName(String value) {
    var oldValue = hostName;
    firePropertyChange(HOST_NAME, oldValue, value);
    hostName = value;
  }

  private int port;
  public int getPort() { return  port; }
  public void setPort(int value) {
    var oldValue = port;
    firePropertyChange(PORT, oldValue, value);
    port = value;
  }

  private Command rescanLocalNetwork = new AbstractCommand() {
    @Override
    public void execute() {

    }
  };
  public Command getRescanLocalNetwork() { return rescanLocalNetwork; }

  private Command fetchFromRpToolsNet = new AbstractCommand() {
    @Override
    public void execute() {

    }
  };
  public Command getFetchFromRpToolsNet() { return fetchFromRpToolsNet; }

  private Command connect = new AbstractCommand() {
    @Override
    public void execute() {

    }
  };
  public Command getConnect() { return connect; }

  private Command cancel = new AbstractCommand() {
    @Override
    public void execute() {

    }
  };
  public Command getCancel() { return cancel; }
}
