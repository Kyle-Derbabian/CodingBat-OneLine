public String zipZap(String str) {
  return str.length() < 3 ? str : str.charAt(0) == 'z' && str.charAt(2) == 'p' ? "zp" + zipZap(str.substring(3)) : str.substring(0, 1) + zipZap(str.substring(1));
}
