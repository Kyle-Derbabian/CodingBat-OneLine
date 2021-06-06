close_far = lambda a, b, c : abs(b - a) <= 1 and abs(c - a) >= 2 and abs(c - b) >= 2 or abs(c - a) <= 1 and abs(b - a) >= 2 and abs(b - c) >= 2
