public boolean linearIn(int[] outer, int[] inner) {
  return inner.length == 0 || Arrays.stream(outer).anyMatch(i -> i == inner[0]) && linearIn(outer, Arrays.copyOfRange(inner, 1, inner.length));
}
