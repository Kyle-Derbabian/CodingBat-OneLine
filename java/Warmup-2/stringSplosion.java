public String stringSplosion(String str) {
  return str.length() < 1 ? str : stringSplosion(str.substring(0, str.length() - 1)) + str.substring(0, str.length());
}
