round_sum = lambda a, b, c : (a - a % 10 if a % 10 < 5 else a + (10 - a % 10)) + (b - b % 10 if b % 10 < 5 else b + (10 - b % 10)) + (c - c % 10 if c % 10 < 5 else c + (10 - c % 10))
