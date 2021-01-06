public int last2(String str) {
  return str.length() <= 1 ? 0 : (str.length() == 2 ? -1 : 0) + (str.indexOf(str.substring(str.length() - 2)) == 0 ? 1 : 0) + last2(str.substring(1));
}
