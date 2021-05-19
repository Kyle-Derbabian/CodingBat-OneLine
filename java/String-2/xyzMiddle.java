public boolean xyzMiddle(String str) {
  return str.length() != 0 && (str.length() <= 4 ? str.contains("xyz") : xyzMiddle(str.substring(1, str.length() - 1)));
}
