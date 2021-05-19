public int count11(String str) {
  return str.length() < 2 ? 0 : str.substring(0, 2).equals("11") ? 1 + count11(str.substring(2)) : count11(str.substring(1));
}
