count_code = lambda str : len([str for i in range(len(str) - 3) if str[i: i + 2] == "co" and str[i + 3] == "e"])
