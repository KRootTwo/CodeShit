from jet import Jet, Fighter, Striker, Bomber, Multirole 

# 3rd Generation
j31 = Fighter("MiG-21 Fishbed", "Mikoyan", 3, 2.05, "Supersonic", "USSR")
j32 = Striker("F-4 Phantom II", "McDonnell Douglas", 3, 2.23, "Supersonic", "USA")
j33 = Multirole("Mirage III", "Dassault", 3, 2.2, "Supersonic", "France")
j34 = Striker("Su-7 Fitter", "Sukhoi", 3, 2.1, "Supersonic", "USSR")
j35 = Striker("F-104 Starfighter", "Lockheed", 3, 2.0, "Supersonic", "USA")
j36 = Striker("SEPECAT Jaguar", "SEPECAT(Dassault + BAE)", 3, 1.6, "Supersonic", "France")


# 4th Generation
j41 = Multirole("F-16 Fighting Falcon", "General Dynamics", 4, 2.0, "Supersonic", "USA")
j42 = Fighter("F-15 Eagle", "McDonnell Douglas", 4, 2.5, "Supersonic", "USA")
j43 = Fighter("Su-27 Flanker", "Sukhoi", 4, 2.35, "Supersonic", "Russia")
j44 = Fighter("MiG-29 Fulcrum", "Mikoyan", 4, 2.25, "Supersonic", "Russia")
j45 = Multirole("Mirage 2000", "Dassault", 4, 2.2, "Supersonic", "France")
j46 = Bomber("Tu-160 Blackjack", "Tupolev", 4, 2.05, "Supersonic", "Russia")


# 5th Generation
j51 = Fighter("F-22 Raptor", "Lockheed Martin", 5, 2.25, "Supersonic", "USA")
j52 = Multirole("F-35 Lightning II", "Lockheed Martin", 5, 1.6, "Supersonic", "USA")
j53 = Fighter("Su-57 Felon", "Sukhoi", 5, 2.0, "Supersonic", "Russia")
j54 = Fighter("J-20 Mighty Dragon", "Chengdu", 5, 2.0, "Supersonic", "China")
j55 = Multirole("J-31 Gyrfalcon", "Shenyang", 5, 1.8, "Supersonic", "China")
j56 = Bomber("B-2 Spirit", "Boeing", 5, 0.95, "Subsonic", "USA")
j57 = Bomber("B-52 Stratofortress", "Boeing", 5, 0.86, "Subsonic", "USA")


# 6th Generation (Concept / Prototype)
j61 = Multirole("NGAD Fighter", "Lockheed/Boeing", 6, 2.0, "Supersonic", "USA")
j62 = Multirole("FCAS Fighter", "Airbus/Dassault", 6, 2.0, "Supersonic", "Europe")
j63 = Multirole("Tempest Fighter", "BAE Systems", 6, 2.0, "Supersonic", "UK")
j64 = Multirole("MiG-41 Concept", "Mikoyan", 6, 4.0, "Hypersonic", "Russia")
j65 = Multirole("J-XX Concept", "AVIC", 6, 2.0, "Supersonic", "China")


jets = [
    j31, j32, j33, j34, j35, j36,
    j41, j42, j43, j44, j45, j46,
    j51, j52, j53, j54, j55, j56, j57, 
    j61, j62, j63, j64, j65
]


for i in jets :
    i.fly()
    print()

"""


"""