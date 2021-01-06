public String stringX(String str) {
  return str.length() <= 2 ? str : str.charAt(0) + str.substring(1, str.length() - 1).replaceAll("x", "") + str.charAt(str.length() - 1);
}
