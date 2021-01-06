public String minCat(String a, String b) {
  return a.length() > b.length() ? a.substring(a.length() - b.length()) + b : b.length() > a.length() ? a + b.substring(b.length() - a.length()) : a + b;
}
