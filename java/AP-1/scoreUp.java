public int scoreUp(String[] key, String[] answers) {
  return answers.length == 0 ? 0 : (answers[0].equals(key[0]) ? 4 : answers[0].equals("?") ? 0 : -1) + scoreUp(Arrays.copyOfRange(key, 1, key.length), Arrays.copyOfRange(answers, 1, answers.length));
}
