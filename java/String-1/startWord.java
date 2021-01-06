public String startWord(String str, String word) {
  return str.length() >= word.length() && word.substring(1).equals(str.substring(1, word.length())) ? str.substring(0, word.length()) : "";
}
