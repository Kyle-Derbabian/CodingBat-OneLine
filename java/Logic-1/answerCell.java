public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  return !isAsleep && (!isMorning || isMorning && isMom);
}