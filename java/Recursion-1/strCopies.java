public boolean strCopies(String str, String sub, int n) {
  return str.length() < sub.length() ? n <= 0 : strCopies(str.substring(1), sub, n - (str.substring(0, sub.length()).equals(sub) ? 1 : 0));
}
