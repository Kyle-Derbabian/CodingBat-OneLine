public int redTicket(int a, int b, int c) {
  return a == 2 && b == 2 && c == 2 ? 10 : a == b && b == c ? 5 : b != a && c != a ? 1 : 0;
}
