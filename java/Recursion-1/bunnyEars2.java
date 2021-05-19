public int bunnyEars2(int bunnies) {
  return bunnies == 0 ? 0 : bunnyEars2(bunnies - 1) + (bunnies % 2 == 0 ? 3 : 2);
}
