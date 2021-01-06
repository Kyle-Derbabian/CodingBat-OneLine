public String frontTimes(String str, int n) {
  return n == 0 ? "" : n == 1 ? str.substring(0, str.length() >= 3 ? 3 : str.length()) : (str.length() < 3 ? str : str.substring(0, 3)) + frontTimes(str, n - 1);
}
