public String startOz(String str) {
  return str.startsWith("oz") ? "oz" : str.startsWith("o") && str.length() > 0 ? "o" : str.length() > 0 && str.substring(1, 2).equals("z") ? "z" : "";
}
