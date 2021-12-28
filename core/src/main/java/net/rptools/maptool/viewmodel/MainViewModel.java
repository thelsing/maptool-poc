package net.rptools.maptool.viewmodel;

import jsinterop.annotations.JsType;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.rptools.maptool.lib.AbstractCommand;
import net.rptools.maptool.lib.Command;
import net.rptools.maptool.lib.PropertyChangeSender;


@JsType
@Slf4j
public class MainViewModel extends PropertyChangeSender {
  @Getter
  private Command connectCommand = new AbstractCommand("Connect to Server") {
    @Override
    public void execute() {
      log.info("test");
      setName(getName() + ".");
      if(getName().endsWith(".........."))
        setAvailable(false);
    }
  };
}
