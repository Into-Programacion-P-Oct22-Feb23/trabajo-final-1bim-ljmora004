datoNumero = 0
suma= 0
contador = 0
media = 0
bandera = True
salir = "si"

while bandera == True:
    datoNumero = int(input("Ingrese los numeros que desea calcular: "))
    suma = suma + datoNumero
    contador = contador + 1
    salir = input("Si desea terminar el programa escriba (si) de lo contrario escriba (no): ")
    if salir == "si":
        bandera= False
media = suma/contador
print("La media de los datos es: ", media)