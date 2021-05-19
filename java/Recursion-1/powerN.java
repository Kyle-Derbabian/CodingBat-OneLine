public int powerN(int base, int n) {
  return n == 0 ? 1 : powerN(base, n - 1) * base;
}
