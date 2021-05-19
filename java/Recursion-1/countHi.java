public int countHi(String str) {
  return str.length() == 0 || str.length() == 1 ? 0 : (str.substring(str.length() - 2).equals("hi") ? 1 : 0) + countHi(str.substring(0, str.length() - 1));
}
