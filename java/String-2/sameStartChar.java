public boolean sameStarChar(String str) {
  return str.length() < 3 || (str.charAt(1) == '*' ? str.charAt(0) == str.charAt(2) && sameStarChar(str.substring(1)) : sameStarChar(str.substring(1)));
}
