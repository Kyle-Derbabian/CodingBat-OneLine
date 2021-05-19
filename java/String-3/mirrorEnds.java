public String mirrorEnds(String string) {
  return (new StringBuilder(string)).reverse().toString().equals(string) ? string : string.length() <= 1 || string.charAt(0) != string.charAt(string.length() - 1) ? "" : string.substring(0, 1) + (string.length() == 1 ? string : "") + mirrorEnds(string.substring(1, string.length() - 1));
}
