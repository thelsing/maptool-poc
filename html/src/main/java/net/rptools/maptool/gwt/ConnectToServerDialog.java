package net.rptools.maptool.gwt;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Computed;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.component.hooks.HasCreated;
import com.google.gwt.core.client.GWT;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import net.rptools.maptool.language.i18n;
import net.rptools.maptool.model.RptoolsServer;
import net.rptools.maptool.viewmodel.ConnectToServerViewModel;

import java.util.List;

@Component
public class ConnectToServerDialog implements IsVueComponent, HasCreated {

  @Computed
  String RPTOOLS() { return "rptools"; }

  @Computed
  String LAN() { return "lan"; }

  @Computed
  String DIRECT() { return "direct"; }

  @Data
  i18n t = GWT.create(i18n.class);

  @Prop
  @Data
  boolean visible = true;

  private ConnectToServerViewModel model = new ConnectToServerViewModel();

  @Computed
  public String getUserName() { return model.getUserName(); }
  @Computed
  public void setUserName(String value) { model.setUserName(value);}

  @Computed
  public String getPassword() { return model.getPassword(); }
  @Computed
  public void setPassword(String value) { model.setPassword(value);}

  @Computed
  public boolean getUseKeyFile() { return model.isUseKeyFile(); }
  @Computed
  public void setUseKeyFile(boolean value) { model.setUseKeyFile(value);}

  @Computed
  public boolean getUseWebRTC() { return model.isUseWebRTC(); }
  @Computed
  public void setUseWebRTC(boolean value) { model.setUseWebRTC(value);}

  @Computed
  public String getServerName() { return model.getServerName(); }
  @Computed
  public void setServerName(String value) { model.setServerName(value);}

  @Computed
  public String getHostName() { return model.getHostName(); }
  @Computed
  public void setHostName(String value) { model.setHostName(value);}

  @Computed
  public int getPort() { return model.getPort(); }
  @Computed
  public void setPort(int value) { model.setPort(value);}

  public List<RptoolsServer> getRpToolsServers() { return model.getRptoolsServers(); }
  public List<String> getLanServers() { return model.getLanServers(); }

  @Override
  public void created() {
    var list = model.getRptoolsServers();
    list.add(new RptoolsServer("first", "1.0"));
    list.add(new RptoolsServer("second", "2.0"));
    list.add(new RptoolsServer("firsta", "3.0"));
    list.add(new RptoolsServer("firstb", "4.0"));
    list.add(new RptoolsServer("firstc", "5.0"));
    list.add(new RptoolsServer("firstd", "6.0"));
    list.add(new RptoolsServer("firste", "7.0"));
    list.add(new RptoolsServer("firstf", "8.0"));
    list.add(new RptoolsServer("firstg", "9.0"));
    list.add(new RptoolsServer("firsth", "10.0"));
    list.add(new RptoolsServer("firsti", "11.0"));

    var lanList = model.getLanServers();
    lanList.add("Lanserver1");
    lanList.add("Lanserver2");
    lanList.add("Lanserver3");
    lanList.add("Lanserver4");

    model.setUserName("testUser");
    model.setPassword("testPassword");
    model.setUseKeyFile(true);
    model.setUseWebRTC(true);
    model.setServerName("testServerName");
    model.setPort(1235);
    model.setHostName("testHostName");

  }

}
