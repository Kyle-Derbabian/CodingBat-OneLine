public boolean scoresIncreasing(int[] scores) {
  return scores.length == 2 ? scores[1] >= scores[0] : scores[1] >= scores[0] && scoresIncreasing(Arrays.copyOfRange(scores, 1, scores.length));
}
