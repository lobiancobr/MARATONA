# -*- coding: utf-8 -*-

S = float(input())

if(S<=2000)
    print("Isento")
elif(S<=3000):
    print("R$ %.2f" % ((S-2000)*.08))
elif(S<=4500):
    print("R$ %.2f" % ((80+(S-3000)*.18)))
else:
    print("R$ %.2f" % ((350+(S-4500)*.28)))