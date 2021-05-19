public int noTeenSum(int a, int b, int c) {
  return (a >= 13 && a <= 19 && a != 15 && a != 16 ? 0 : a) + (b >= 13 && b <= 19 && b != 15 && b != 16 ? 0 : b) + (c >= 13 && c <= 19 && c != 15 && c != 16 ? 0 : c);
}
