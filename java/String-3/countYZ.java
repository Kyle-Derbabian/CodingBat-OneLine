public int countYZ(String str) {
  return str.length() == 2 ? (str.length() == 2 && (str.charAt(1) == 'y' || str.charAt(1) == 'Y' || str.charAt(1) == 'z' || str.charAt(1) == 'Z')) || (str.charAt(0) == 'y' || str.charAt(0) == 'Y' || str.charAt(0) == 'z' || str.charAt(0) == 'Z') && !Character.isLetter(str.charAt(1)) ? 1 : 0 : ((str.charAt(0) == 'y' || str.charAt(0) == 'Y' || str.charAt(0) == 'z' || str.charAt(0) == 'Z') && !Character.isLetter(str.charAt(1)) ? 1 : 0) + countYZ(str.substring(1));
}
