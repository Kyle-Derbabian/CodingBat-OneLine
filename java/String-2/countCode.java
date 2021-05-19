public int countCode(String str) {
  return str.length() < 4 ? 0 : (str.substring(0, 2).equals("co") && str.charAt(3) == 'e' ? 1 : 0) + countCode(str.substring(1));
}
