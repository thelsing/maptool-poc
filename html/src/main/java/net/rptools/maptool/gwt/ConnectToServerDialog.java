package net.rptools.maptool.gwt;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

@Component
public class ConnectToServerDialog implements IsVueComponent {
  @Prop
  boolean visible = true;
}