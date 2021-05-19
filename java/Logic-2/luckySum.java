public int luckySum(int a, int b, int c) {
  return a == 13 ? 0 : b == 13 ? a : c == 13 ? a + b : a + b + c;
}
