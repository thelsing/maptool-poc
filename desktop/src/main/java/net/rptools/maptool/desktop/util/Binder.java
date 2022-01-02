package net.rptools.maptool.desktop.util;

import net.rptools.maptool.lib.Command;

import javax.swing.*;

public class Binder {
  public static void bind(Command command, JButton button) {
    command.addPropertyChangeListener((evt) -> {
      if (evt.getPropertyName().equals(Command.AVAILABLE)) {
        button.setEnabled((boolean) evt.getNewValue());
      }
    });

    button.setEnabled(command.isAvailable());
    button.addActionListener((evt)-> {
      if(command.isAvailable()) {
        command.execute();
      }
    });
  }
}
