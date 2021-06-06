string_match = lambda a, b : len([1 for i in range(len(b) - 1) if a[i : i + 2] == b[i : i + 2]]) if len(a) > len(b) else len([1 for i in range(len(a) - 1) if b[i : i + 2] == a[i : i + 2]])
