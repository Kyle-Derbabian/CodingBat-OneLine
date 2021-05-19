public String noX(String str) {
  return str.indexOf("x") == -1 ? str : noX(str.substring(0, str.length() - 1)) + (str.substring(str.length() - 1).equals("x") ? "" : str.substring(str.length() - 1));
}
