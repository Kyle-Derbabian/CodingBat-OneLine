public boolean prefixAgain(String str, int n) {
  return str.substring(1).contains(str.substring(0, n));
}
