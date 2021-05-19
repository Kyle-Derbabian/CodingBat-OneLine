public int loneSum(int a, int b, int c) {
  return a == b && b == c ? 0 : b == c ? a : a == c ? b : a == b ? c : a + b + c;
}
