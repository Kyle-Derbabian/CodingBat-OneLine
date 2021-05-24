public int sumNumbers(String str) {
  return !str.matches(".*\\d.*") ? 0 : new Scanner(str).useDelimiter("\\D+").nextInt() + sumNumbers(str.substring(str.indexOf(String.valueOf(new Scanner(str).useDelimiter("\\D+").nextInt())) + String.valueOf(new Scanner(str).useDelimiter("\\D+").nextInt()).length()));
}
