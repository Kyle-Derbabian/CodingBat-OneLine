public int countHi(String str) {
  return str.length() < 2 ? 0 : (str.substring(0, 2).equals("hi") ? 1 : 0) + countHi(str.substring(1));
}
