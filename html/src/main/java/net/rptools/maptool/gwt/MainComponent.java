package net.rptools.maptool.gwt;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import jsinterop.annotations.JsMethod;
import net.rptools.maptool.language.i18n;
import net.rptools.maptool.viewmodel.MainViewModel;


@Component(components = {ConnectToServerDialog.class})
public class MainComponent implements IsVueComponent {
  @Data
  i18n t = GWT.create(i18n.class);

  @Data
  MainViewModel model = new MainViewModel();

  @JsMethod
  void noop() {}
}
