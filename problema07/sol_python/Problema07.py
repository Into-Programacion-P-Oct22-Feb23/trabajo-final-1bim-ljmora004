contador = 2
resultado = 0
numero = float(input("Ingrese hasta que número desea sumar: "))
if numero >= 2:
	while contador <= numero:
		resultado = contador + 2
		contador = contador + 2
else:
	print("Error, el número ingresado es menor a 2."
		+ "\nIntentelo de nuevo.")
print("La suma de los números pares hasta el ", numero, 
	" es: ", resultado)				