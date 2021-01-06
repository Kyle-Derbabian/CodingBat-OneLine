public String altPairs(String str) {
  return str.length() <= 2 ? str : str.substring(0, 2) + (str.length() >= 4 ? altPairs(str.substring(4)) : "");
}
