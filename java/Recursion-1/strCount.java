public int strCount(String str, String sub) {
  return str.length() <= sub.length() ? str.equals(sub) ? 1 : 0 : str.substring(0, sub.length()).equals(sub) ? strCount(str.substring(sub.length()), sub) + 1 : strCount(str.substring(1), sub);
}
