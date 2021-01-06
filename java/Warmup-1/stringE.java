public boolean stringE(String str) {
  return 1 <= str.chars().filter(ch -> ch == 'e').count() && str.chars().filter(ch -> ch == 'e').count() <= 3;
}
