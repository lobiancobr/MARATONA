# -*- coding: utf-8 -*-

nivel1 = input()
nivel2 = input()
nivel3 = input()

animais = {
    "vertebrado": {
        "ave":      {"carnivoro": "aguia",    "onivoro": "pomba"},
        "mamifero": {"onivoro":   "homem",    "herbivoro": "vaca"},
    },
    "invertebrado": {
        "inseto":   {"hematofago": "pulga",   "herbivoro": "lagarta"},
        "anelideo": {"hematofago": "sanguessuga", "onivoro": "minhoca"},
    },
}

print(animais[nivel1][nivel2][nivel3])
