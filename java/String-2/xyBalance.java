public boolean xyBalance(String str) {
  return str.length() < 2 && (str.length() == 0 || str.charAt(0) != 'x') || str.charAt(0) == 'x' && str.substring(1).contains("y") && xyBalance(str.substring(str.indexOf("y"))) || str.charAt(0) != 'x' && xyBalance(str.substring(1));
}
