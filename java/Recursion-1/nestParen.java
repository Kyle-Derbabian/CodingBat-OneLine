public boolean nestParen(String str) {
  return str.length() == 0 || (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')' ? nestParen(str.substring(1, str.length() - 1)) : false);
}
