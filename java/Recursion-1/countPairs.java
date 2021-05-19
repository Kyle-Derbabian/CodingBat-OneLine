public int countPairs(String str) {
  return str.length() <= 2 ? 0 : countPairs(str.substring(1)) + (str.charAt(0) == str.charAt(2) ? 1 : 0);
}
