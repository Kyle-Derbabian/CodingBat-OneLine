public int countTriple(String str) {
  return str.length() < 3 ? 0 : (str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2) ? 1 : 0) + countTriple(str.substring(1));
}
