#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'textQueries' function below.
#
# The function accepts following parameters:
#  1. STRING_ARRAY sentences
#  2. STRING_ARRAY queries
#

from collections import defaultdict
def textQueries(sentences, queries):
    # Write your code here
    res = defaultdict(str)
    q_set = defaultdict(int)
    #change string array of all words in query to set for faster access
    for query_index,query in enumerate(queries):
        q_set[query_index] = set(query.split())
    #same for sentences, turn them into sets
    for sentence_index,sentence in enumerate(sentences):
        s_set = set(sentence.split())
        #once established set, see if the intersection of 2 sets is equal to query_set
        for k,v in q_set.items():
            if len(v & s_set) is len(v):
                res[k] += str(sentence_index) + " "
    for i in range(0,len(queries)):
        if i in res.keys():
            print(res[i])
        else:
            print(-1)

if __name__ == '__main__':
