public int userCompare(String aName, int aId, String bName, int bId) {
  return aName.compareTo(bName) == 0 ? (int) Math.signum(aId - bId) : (int) Math.signum(aName.compareTo(bName));
}
