make_bricks = lambda small, big, goal : len([small for i in range(big) if (big - i) * 5 < goal and ((big - i) * 5) + small >= goal]) > 0 or small >= goal or goal % 5 == 0
