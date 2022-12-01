<<<<<<< HEAD
precioTraje = float(input("Ingrese el precio unitario del traje: "))
cantidadTraje = int(input("Ingrese la cantidad de trajes: "))
valorTotal = 0
subTotal = 0
descuento = 0

subTotal = precioTraje * cantidadTraje
if cantidadTraje == 1:
    descuento = (subTotal * 20) / 100
else:
    if cantidadTraje == 2:
        descuento = (subTotal * 25)/ 100
    else:
        if cantidadTraje == 3:
            descuento = (subTotal * 40)/ 100
        else:
            descuento = (precioTraje * 50) / 100

valorTotal = subTotal - descuento

print ("El subtotal del traje es de: $", precioTraje)
print ("El descuento que se aplica es de: $", descuento)
print ("El valor final a pagar es de: $", valorTotal)
=======
cantidadTraje = int(input("Ingrese la cantidad de trajes: "))
precioTraje = float(input("Ingrese el precio unitario del traje: "))
valorTotal = 0
descuento = 0


if cantidadTraje == 1:
    descuento = (precioTraje * 20) / 100
else:
    if cantidadTraje == 2:
        descuento = (precioTraje * 25)/ 100
    else:
        if cantidadTraje == 3:
            descuento = (precioTraje * 40)/ 100
        else:
            if cantidadTraje > 3:
                descuento = (precioTraje * 50) / 100
valorTotal = precioTraje - descuento

print ("El subtotal del traje es de: " + precioTraje)
print ("El descuento que se aplica es de: " + descuento)
print ("El valor final a pagar es de: " + valorTotal)
>>>>>>> cf6e067ebc047f319a7bd0f51a36962516d0b716
