public List wordsWithoutList(String[] words, int len) {
  return Arrays.asList(words).stream().filter(n -> n.length() != len).collect(Collectors.toList());
}
