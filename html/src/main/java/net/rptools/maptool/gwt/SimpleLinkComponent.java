package net.rptools.maptool.gwt;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.google.gwt.user.client.Window;
import jsinterop.annotations.JsMethod;
import net.rptools.maptool.viewmodel.MainViewModel;

@Component
public class SimpleLinkComponent implements IsVueComponent {
  @Data
  MainViewModel model = new MainViewModel();

  @JsMethod
  void execute() {
    model.getConnectCommand().execute();
  }

  @JsMethod
  void execute2() {
    Window.alert("foobar3!");
  }
}
