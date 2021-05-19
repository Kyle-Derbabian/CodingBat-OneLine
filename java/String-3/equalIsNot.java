public boolean equalIsNot(String str) {
  return (str.length() - str.replaceAll("is", "").length()) / 2 == (str.length() - str.replaceAll("not", "").length()) / 3;
}
