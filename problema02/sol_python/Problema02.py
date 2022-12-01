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
