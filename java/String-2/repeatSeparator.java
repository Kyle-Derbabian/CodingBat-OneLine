public String repeatSeparator(String word, String sep, int count) {
  return count == 0 ? "" : word + (count == 1 ? "" : sep) + repeatSeparator(word, sep, count - 1);
}
