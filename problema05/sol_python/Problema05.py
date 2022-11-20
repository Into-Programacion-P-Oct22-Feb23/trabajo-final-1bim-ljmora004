x = float(input("Ingrese el valor de X: "))
y = float(input("Ingrese el valor de Y: "))
if x >= 0 and y >= 0:
	print("Valores pertenecientes al cuadrante 1.")
elif x < 0 and y >= 0:
	print("Valores pertenecientes al cuadrante 2.")
elif x < 0 and y < 0:
	print("Valores pertenecientes al cuadrante 3.")
else:
	print("Valores pertenecientes al cuadrante 4.")			