public String parenBit(String str) {
  return str.charAt(0) != '(' ? parenBit(str.substring(1)) : str.charAt(str.length() - 1) != ')' ? parenBit(str.substring(0, str.length() - 1)) : str;
}
