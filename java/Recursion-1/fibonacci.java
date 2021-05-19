public int fibonacci(int n) {
  return n == 0 ? 0 : n == 1 ? 1 : fibonacci(n - 2) + fibonacci(n - 1);
}
