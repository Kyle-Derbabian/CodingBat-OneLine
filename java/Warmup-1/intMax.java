public int intMax(int a, int b, int c) {
  return c >= a && c >= b ? c : b >= a && b >= c ? b : a;
}
