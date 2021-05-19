public int sumDigits(String str) {
  return str.length() == 0 ? 0 : (Character.isDigit(str.charAt(0)) ? Integer.parseInt(str.substring(0, 1)) : 0) + sumDigits(str.substring(1));
}
