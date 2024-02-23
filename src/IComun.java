public interface IComun {

    public static final Integer CARTON = 0;
    public static final Integer CAJA = 1;
    public static final Integer PALE = 2;

    public static final Integer [] cpGalicia = {15, 27, 36, 32};
    public static final Integer [] cpMadrid = {18};
    public static final Integer [] cpBarcelona = {25,43,8,17};

    public float costeTotal(Integer cp);
}
