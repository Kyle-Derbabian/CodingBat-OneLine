public String stringBits(String str) {
  return str.length() <= 1 ? str : str.charAt(0) + stringBits(str.substring(2));
}
