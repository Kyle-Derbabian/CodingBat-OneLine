public String doubleChar(String str) {
  return str.length() == 0 ? "" : str.substring(0, 1) + str.substring(0, 1) + doubleChar(str.substring(1));
}
