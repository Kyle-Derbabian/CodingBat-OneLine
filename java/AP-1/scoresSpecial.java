public int scoresSpecial(int[] a, int[] b) {
  return (Arrays.stream(a).filter(n -> n % 10 == 0).toArray().length > 0 ? Arrays.stream(Arrays.stream(a).filter(n -> n % 10 == 0).toArray()).max().getAsInt() : 0) + (Arrays.stream(b).filter(n -> n % 10 == 0).toArray().length > 0 ? Arrays.stream(Arrays.stream(b).filter(n -> n % 10 == 0).toArray()).max().getAsInt() : 0);
}
