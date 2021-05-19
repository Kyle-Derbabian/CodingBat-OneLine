public String repeatFront(String str, int n) {
  return n == 0 ? "" : str.substring(0, n) + repeatFront(str, n - 1);
}
