public String repeatEnd(String str, int n) {
  return new String(new char[n]).replace("\0", str.substring(str.length() - n));
}
