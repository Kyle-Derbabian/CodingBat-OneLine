public String wordEnds(String str, String word) {
  return str.replaceAll(".*?(?=word)(?<=(.|^))word(?=(.|$))|.+".replace("word", java.util.regex.Pattern.quote(word)), "$1$2");
}
