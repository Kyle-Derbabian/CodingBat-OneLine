public boolean endOther(String a, String b) {
  return (a.length() >= b.length() && a.substring(a.length() - b.length()).toLowerCase().equals(b.toLowerCase())) || (b.length() > a.length() && b.substring(b.length() - a.length()).toLowerCase().equals(a.toLowerCase()));
}
