public boolean dividesSelf(int n) {
  return !String.valueOf(n).contains("0") && (!String.valueOf(n).contains("2") || n % 2 == 0) && (!String.valueOf(n).contains("3") || n % 3 == 0) && (!String.valueOf(n).contains("4") || n % 4 == 0) && (!String.valueOf(n).contains("5") || n % 5 == 0) && (!String.valueOf(n).contains("6") || n % 6 == 0) && (!String.valueOf(n).contains("7") || n % 7 == 0) && (!String.valueOf(n).contains("8") || n % 8 == 0) && (!String.valueOf(n).contains("9") || n % 9 == 0);
}
