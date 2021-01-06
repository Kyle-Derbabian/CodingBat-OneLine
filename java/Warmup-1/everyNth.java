public String everyNth(String str, int n) {
  return str.length() <= n ? str.substring(0, 1) : str.charAt(0) + everyNth(str.substring(n), n);
}
