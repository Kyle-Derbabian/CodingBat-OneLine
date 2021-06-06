make_chocolate = lambda small, big, goal : small if goal < 5 else goal - big * 5 if small >= goal - big * 5  and big * 5 <= goal else goal - 5 if goal % 5 < 5 and small >= goal - 5 else -1
