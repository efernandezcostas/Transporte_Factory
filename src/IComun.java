public interface IComun {

    /**
     * Tipos de embalaje
     */
    public static final Integer CARTON = 0;
    public static final Integer CAJA = 1;
    public static final Integer PALE = 2;

    /**
     * Listas de los Códigos Postales
     */
    public static final Integer [] cpGalicia = {15, 27, 36, 32};
    public static final Integer [] cpMadrid = {18};
    public static final Integer [] cpBarcelona = {25,43,8,17};


    /**
     * Recibe el tamaño y el peso del producto y devuelve el tipo de embalaje que se va a utilizar.
     * @param x - Anchura del paquete
     * @param y - Altura del paquete
     * @param z - Profundidad del paquete
     * @param peso - Peso del paquete
     * @return Tipo de embalaje que se va a utilizar
     */
    public static Integer tipoEmbalaje(float x, float y, float z, float peso){
        Integer embalaje;
        if (peso > 10)                          embalaje = IComun.PALE;
        else if (peso>1 && x + y + z > 100)     embalaje = IComun.CAJA;
        else                                    embalaje = IComun.CARTON;
        return embalaje;
    }

    /**
     * Recibe el código postal y el tipo de embalaje.
     * Cálcula el precio según estos parámetros.
     * @param cp - Código Postal.
     * @param embalaje - Tipo de embalaje obtenido con el método estático tipoEmbalaje().
     * @return Coste total del envío.
     */
    float costeTotal(Integer cp, Integer embalaje);
}
