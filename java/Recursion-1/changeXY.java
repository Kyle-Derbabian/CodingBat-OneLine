public String changeXY(String str) {
  return str.indexOf("x") == -1 ? str : changeXY(str.substring(0, str.length() - 1)) + (str.substring(str.length() - 1).equals("x") ? "y" : str.substring(str.length() - 1));
}
