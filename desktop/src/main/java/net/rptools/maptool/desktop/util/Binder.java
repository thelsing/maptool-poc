package net.rptools.maptool.desktop.util;

import lombok.NonNull;
import net.rptools.maptool.lib.Command;

import javax.swing.*;

public class Binder {
  public static void bind(@NonNull Command command, @NonNull JButton button) {
    command.addPropertyChangeListener((evt) -> {
      if(evt.getPropertyName().equals(Command.NAME)) {
        button.setText((String)evt.getNewValue());
      } else if (evt.getPropertyName().equals(Command.AVAILABLE)) {
        button.setEnabled((boolean) evt.getNewValue());
      }
    });
    button.setText(command.getName());
    button.setEnabled(command.isAvailable());
    button.addActionListener((evt)-> {
      if(command.isAvailable()) {
        command.execute();
      }
    });
  }
}
