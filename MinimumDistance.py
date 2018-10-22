#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumDistances function below.
def minimumDistances(a):
    c = {}
    index = 0
    min  = len(a)+1
    for i in a:
        if i in c:
            if abs(index - c[i]) < min:
                min = abs(index - c[i])
        c[i] = index
        index += 1
    if min is len(a)+1:
        min = -1
    return min
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    a = list(map(int, input().rstrip().split()))


    result = minimumDistances(a)

    fptr.write(str(result) + '\n')

    fptr.close()
