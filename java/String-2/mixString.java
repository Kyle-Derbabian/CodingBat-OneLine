public String mixString(String a, String b) {
  return a.length() * b.length() == 0 ? a + b : a.substring(0, 1) + b.substring(0, 1) + mixString(a.substring(1), b.substring(1));
}
