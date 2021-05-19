public boolean xyzThere(String str) {
  return str.length() < 4 ? str.contains("xyz") : str.substring(0, 4).equals(".xyz") ? xyzThere(str.substring(4)) : str.substring(0, 4).contains("xyz") ? str.contains("xyz") : xyzThere(str.substring(1));
}
