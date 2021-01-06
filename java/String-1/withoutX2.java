public String withoutX2(String str) {
  return str.length() >= 2 ? str.charAt(0) == 'x' && str.charAt(1) == 'x' ? str.substring(2) : str.charAt(0) == 'x' ? str.substring(1) : str.charAt(1) == 'x' ? str.substring(0, 1) + str.substring(2) : str : "";
}
