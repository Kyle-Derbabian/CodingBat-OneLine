last2 = lambda str : len([1 for i in xrange(len(str)) if str[i : ].startswith(str[-2 : ])]) - 1 if len(str) > 0 else 0
