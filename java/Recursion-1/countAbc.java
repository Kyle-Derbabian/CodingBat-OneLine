public int countAbc(String str) {
  return str.length() <= 2 ? 0 : countAbc(str.substring(1)) + (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba") ? 1 : 0);
}
