public String plusOut(String str, String word) {
  return str.replaceAll("\\G((?:" + java.util.regex.Pattern.quote(word) + ")*+).", "$1+");
}
