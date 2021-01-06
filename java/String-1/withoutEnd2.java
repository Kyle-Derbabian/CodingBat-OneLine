public String withouEnd2(String str) {
  return str.length() > 1 ? str.substring(1, str.length() - 1) : str.length() == 1 ? "" : str;
}
