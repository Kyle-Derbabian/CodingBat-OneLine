public int strDist(String str, String sub) {
  return str.indexOf(sub) != -1 && str.lastIndexOf(sub) != -1 ? str.lastIndexOf(sub) + sub.length() - str.indexOf(sub) : 0;
}
