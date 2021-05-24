public int maxBlock(String str) {
  return str.length() == 0 ? 0 : str.length() == 1 ? 1 : new Scanner(str).useDelimiter("[" + str.substring(0, 1) + "]*").hasNext() ? Math.max(str.indexOf(new Scanner(str).useDelimiter("[" + str.substring(0, 1) + "]*").next()), maxBlock(str.substring(str.indexOf(new Scanner(str).useDelimiter("[" + str.substring(0, 1) + "]*").next())))) : str.length();
}
