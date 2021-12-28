package net.rptools.maptool.gwt;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

@Component
public class SimpleLinkComponent implements IsVueComponent {
  @Data
  String linkName = "Hello Vue GWT!";
}
