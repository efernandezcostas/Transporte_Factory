public interface IComun {

    public static final Integer PALE = 0;
    public static final Integer CARTON = 1;
    public static final Integer CAJA = 2;

    public float costeTotal(Integer cp);

    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);
}