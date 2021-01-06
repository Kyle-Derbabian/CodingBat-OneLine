public String stringTimes(String str, int n) {
  return n == 0 ? "" : str + (n == 1 ? "" : stringTimes(str, n - 1));
}
