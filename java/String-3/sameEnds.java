public String sameEnds(String string) {
  return string.substring(0, string.length() / 2).equals(string.substring(string.length() / 2 + string.length() % 2)) ? string.substring(0, string.length() / 2) : sameEnds(string.substring(0, string.length() / 2 - 1) + string.substring(string.length() / 2 + 1));
}
