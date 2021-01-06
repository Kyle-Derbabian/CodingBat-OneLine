public String stringYak(String str) {
  return str.length() < 3 ? str : str.charAt(0) == 'y' && str.charAt(2) == 'k' ? stringYak(str.substring(3)) : str.charAt(0) + stringYak(str.substring(1));
}
