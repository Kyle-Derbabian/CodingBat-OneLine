public String withoutX(String str) {
  return str.length() >= 2 ? str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x' ? str.substring(1, str.length() - 1) : str.charAt(0) == 'x' ? str.substring(1) : str.charAt(str.length() - 1) == 'x' ? str.substring(0, str.length() - 1) : str : "";
}
