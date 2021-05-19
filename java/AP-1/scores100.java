public boolean scores100(int[] scores) {
  return scores.length == 2 ? scores[0] == 100 && scores[1] == 100 : scores[0] == 100 && scores[1] == 100 || scores100(Arrays.copyOfRange(scores, 1, scores.length));
}
