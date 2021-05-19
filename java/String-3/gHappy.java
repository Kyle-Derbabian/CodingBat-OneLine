public boolean gHappy(String str) {
  return (str.length() <= 2 && (!str.contains("g") || str.indexOf("g") != str.lastIndexOf("g"))) || (str.length() > 2 && (str.charAt(0) == 'g' && str.charAt(2) != 'g' ? str.charAt(1) == 'g' && gHappy(str.substring(2)) : gHappy(str.substring(1))));
}
