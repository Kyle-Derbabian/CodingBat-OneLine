public boolean scoresClump(int[] scores) {
  return scores.length == 3 ? Math.max(Math.abs(scores[1] - scores[0]), Math.max(Math.abs(scores[2] - scores[1]), Math.abs(scores[0] - scores[2]))) <= 2 : Math.max(Math.abs(scores[1] - scores[0]), Math.max(Math.abs(scores[2] - scores[1]), Math.abs(scores[0] - scores[2]))) <= 2 || scoresClump(Arrays.copyOfRange(scores, 1, scores.length));
}
