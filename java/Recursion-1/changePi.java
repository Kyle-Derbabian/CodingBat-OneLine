public String changePi(String str) {
  return str.indexOf("pi") == -1 ? str : str.substring(str.length() - 2).equals("pi") ? changePi(str.substring(0, str.length() - 2)) + "3.14" : changePi(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1);
}
