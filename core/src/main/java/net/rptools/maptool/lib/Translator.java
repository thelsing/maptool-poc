package net.rptools.maptool.lib;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType
public interface Translator {
  default String $t(String key) {return "translated!!";}
  default String trans(String key) {return "translated";}
}
