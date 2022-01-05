package net.rptools.maptool.gwt;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Computed;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.component.hooks.HasCreated;
import com.google.gwt.core.client.GWT;
import jsinterop.annotations.JsMethod;
import net.rptools.maptool.language.i18n;
import net.rptools.maptool.model.RptoolsServer;
import net.rptools.maptool.viewmodel.ConnectToServerViewModel;

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

  @Data
  ConnectToServerViewModel model = new ConnectToServerViewModel();

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
  }

}
