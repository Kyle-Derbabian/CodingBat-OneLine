public int makeChocolate(int small, int big, int goal) {
  return goal - Math.min(goal / 5, big) * 5 <= small ? goal - Math.min(goal / 5, big) * 5 : -1;
}
