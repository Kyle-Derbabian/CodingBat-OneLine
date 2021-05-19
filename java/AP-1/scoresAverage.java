public int scoresAverage(int[] scores) {
  return Math.max(Arrays.stream(Arrays.copyOfRange(scores, 0, scores.length / 2)).sum() / Arrays.copyOfRange(scores, 0, scores.length / 2).length, Arrays.stream(Arrays.copyOfRange(scores, scores.length / 2, scores.length)).sum() / Arrays.copyOfRange(scores, scores.length / 2, scores.length).length);  
}
