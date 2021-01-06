public int stringMatch(String a, String b) {
  return a.length() < 2 || b.length() < 2 ? 0 : (a.substring(0, 2).equals(b.substring(0, 2)) ? 1 : 0) + stringMatch(a.substring(1), b.substring(1));
}
