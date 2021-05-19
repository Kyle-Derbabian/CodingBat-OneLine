public boolean evenlySpaced(int a, int b, int c) {
  return Math.max(Math.max(a, b), c) - a - b - c + Math.max(Math.max(a, b), c) + Math.min(Math.min(a, b), c) == a + b + c - Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c) - Math.min(Math.min(a, b), c);
}
