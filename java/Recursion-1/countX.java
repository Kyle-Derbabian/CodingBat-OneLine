public int countX(String str) {
  return str.length() == 0 ? 0 : (str.substring(str.length() - 1).equals("x") ? 1 : 0) + countX(str.substring(0, str.length() - 1));
}
