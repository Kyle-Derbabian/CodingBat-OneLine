public String endX(String str) {
  return str.length() == 0 ? str : str.charAt(0) == 'x' ? endX(str.substring(1)) + "x" : str.charAt(0) + endX(str.substring(1));
}
