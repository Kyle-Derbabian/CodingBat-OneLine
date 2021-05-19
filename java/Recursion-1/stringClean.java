public String stringClean(String str) {
  return str.length() == 1 ? str : str.charAt(0) == str.charAt(1) ? stringClean(str.charAt(0) + str.substring(2)) : str.charAt(0) + stringClean(str.substring(1));
}
