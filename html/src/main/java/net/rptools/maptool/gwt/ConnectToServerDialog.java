package net.rptools.maptool.gwt;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.google.gwt.core.client.GWT;
import net.rptools.maptool.language.i18n;

@Component
public class ConnectToServerDialog implements IsVueComponent {
  @Data
  i18n t = GWT.create(i18n.class);

  @Prop
  @Data
  boolean visible = true;
}
