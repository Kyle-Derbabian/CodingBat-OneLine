public int close10(int a, int b) {
  return Math.abs(10 - a) < Math.abs(10 - b) ? a : Math.abs(10 - b) < Math.abs(10 - a) ? b : 0;
}
