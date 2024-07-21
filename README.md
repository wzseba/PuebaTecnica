# PuebaTecnica

Sponer un sistema de reseva de asientos para un anfiteatro. El teatro cuenta con 10 filas de 10 asientos cada una. Se necesita desarrollar un sistem  (sin uso de bases de datos, unicamente manejo de datos en forma logica) que permitan llevar a cabo lo siguente.

## Parte 1

1) Cargar el "mapa" de filas y asientos. Indicando con una "X" los asientos ocupados y con una "L" los asientos libres. Al iniciar el programa, todos los asientos deben estar libres.

2) Manejar la reserva de asientos contemplando que un asiento solo puede ser reservado si se encuentra en estado "L", en caso de que este en estado "X", se debera permitir al comprador elegir otro asiento. Si se encuentra en estado "L" , debera pasar automaticamente a estado "X".

3) Para finalizar el programa se debera ingresar un valor en particular. Contemplar que no existe una cantidad exacta de veces que el programa se puede ejecutar.

4) Contemplar que solo existen 10 filas y 10 asientos. No se pueden vender asientos fuera de esas numeraciones. No se permite sobreventa.

##### No es necesaria implementacion de igu ni db. Se evaluara el manejo logico del desarrollo de la aplicacion.

##### Extra: En caso de que un cliente solicite visualizar cuales son los asientos libre, el sistema debe permitir mostrar de forma grafica el mapa de asientos. No utilizar igu, utilizar solamente logica y salida por consola.