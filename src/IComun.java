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
     * Recibe el código postal y dependendiendo de él y del tipo de embalaje calcula el precio.
     * @param cp -> Código Postal
     * @return coste total del envío
     */
    public float costeTotal(Integer cp);
}
