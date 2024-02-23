# Alternativa Factory Transporte

### Interfaz IComun
Interfaz implementada por las clases Camión y Bicicleta. \
Esta tiene los métodos getCoste.

*El método tipoEmbalaje() fue trasladado al factory por el funcionamiento del programa.


### Factory
Factory Transporte tiene el método tipoEmbalaje() que, dependiendo de las medidas y el peso del paquete, selecciona el mejor embalaje disponible.
También tiene el método getTransporte() que selecciona un tipo de vehículo dependiendo de el tipo de embalaje, siendo: 
- Caja y palé enviados en camión. 
- Cartón enviado en bicicleta.