medida = float(input("Ingrese una medida en metros: "))
metros = 1
pulgadas = 0
pies = 0
yardas = 0
print("\nMetros\tYardas\tPies\tPulgadas\n")
while metros <= medida:
	pulgadas = (metros * 100)/2.54
	pies = (metros * 39.37)/12
	yardas = (metros * 3.28)/3
	print(metros, "\t", round(yardas, 2), "\t", round(pies, 2), "\t",round(pulgadas, 2), "\n")
	metros = metros + 1