public int blackjack(int a, int b) {
  return a > 21 && b > 21 ? 0 : a > 21 ? b : b > 21 ? a : a > b ? a : b;
}
