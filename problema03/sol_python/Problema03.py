valorAdicional = 0
salarioFinal = 0
nombre = input("Ingrese su nombre: ")
tipo = int(input("Ingrese el tipo de empleado que es: "))
horasTrabajadas = int(input("Ingrese el número de horas trabajadas: "))
costoHora = float(input("Ingrese la cuota a pagar por hora: "))

salarioFinal = horasTrabajadas * costoHora
if tipo == 1:
	valorAdicional = costoHora * 1.5
	salarioFinal = valorAdicional * horasTrabajadas
elif tipo == 2:
	valorAdicional = costoHora * 2
	salarioFinal = valorAdicional * horasTrabajadas
elif tipo == 3:
	valorAdicional = costoHora * 2.5
	salarioFinal = valorAdicional * horasTrabajadas	
elif tipo == 4:
	valorAdicional = costoHora * 3
	salarioFinal = valorAdicional * horasTrabajadas
else:
	print("Lo sentimos, el tipo de empleado ingresado no existe o no" + 
	" tiene derecho a pago por horas extras.")

print("El empleado ", nombre, " de tipo ", tipo, " tiene un "
                + "salario final de ", salarioFinal, " dólares.\n")	        