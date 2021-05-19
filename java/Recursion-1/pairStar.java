public String pairStar(String str) {
  return str.length() < 2 ? str : str.charAt(0) + (str.charAt(0) == str.charAt(1) ? "*" : "") + pairStar(str.substring(1));
}
