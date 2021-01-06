int countXX(String str) {
  return str.length() <= 1 ? 0 : (str.indexOf("xx") == 0 ? 1 : 0) + countXX(str.substring(1));
}
