public int countHi2(String str) {
  return str.length() <= 1 ? 0 : str.length() > 2 && str.substring(0, 3).equals("xhi") ? countHi2(str.substring(3)) : str.substring(0, 2).equals("hi") ? 1 + countHi2(str.substring(2)) : countHi2(str.substring(1));
}
