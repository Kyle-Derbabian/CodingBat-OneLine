public int wordsCount(String[] words, int len) {
  return words.length == 0 ? 0 : (words[0].length() == len ? 1 : 0) + wordsCount(Arrays.copyOfRange(words, 1, words.length), len);
}
