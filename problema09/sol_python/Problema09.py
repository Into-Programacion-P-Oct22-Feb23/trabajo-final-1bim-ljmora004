contador = 1
positivos = 0
termino_positivo = 12
negativos = 0
termino_negativo = -11
mensaje = ""
serie = "S1 = 12−11+24−22+36−33+48−44"
numero = int(input("Cuál es el número de términos que desea imprimir" 
	" de la serie:\n" + serie + "\n>> "))
if numero <= 8:
	while contador <= numero:
		if numero == 1:
			mensaje = mensaje + str(termino_positivo)
		elif contador % 2 == 1:
			positivos = positivos + termino_positivo
			mensaje = mensaje + "+" + str(positivos)
		elif contador % 2 == 0:
			negativos = negativos + termino_negativo
			mensaje = mensaje + str(negativos)
	contador = contador + 1
else:
	print("Error, el número de términos que escogió no existe.")

print(mensaje)						