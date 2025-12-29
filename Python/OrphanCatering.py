childCount = int(input("Enter the number of kids present in orphanage: "))
budget = int(input("Enter budget: "))

total_cost = childCount*55

if total_cost > budget :
	print ("Warning! cost out of budget.")
else :
	print ("Cost is under budget.") 
