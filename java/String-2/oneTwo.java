public String oneTwo(String str) {
  return str.length() < 3 ? "" : str.substring(1, 2) + str.substring(2, 3) + str.substring(0, 1) + oneTwo(str.substring(3));
}
