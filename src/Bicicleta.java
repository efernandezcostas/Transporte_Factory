public class Bicicleta implements IComun{

    private Float costeTotal;
    private Float costeBase ;
    private Integer embalaje;

    private Integer [] cpGalicia = {15, 27, 36, 32};
    private Integer [] cpMadrid = {18};
    private Integer [] cpBarcelona = {25,43,8,17};

    @Override
    public float costeTotal(Integer cp) {
        float costeBase = embalaje*10f;
        float costeTotal = costeBase;

        String stringTwoFirst = cp.toString().charAt(0) + cp.toString().charAt(1) + "";
        Integer twoFirstCP = Integer.parseInt(stringTwoFirst);

        for (Integer ele : cpGalicia){
            if (ele.equals(twoFirstCP)){
                costeTotal=costeBase*1.5f;
            }
        }

        for (Integer ele : cpMadrid){
            if (ele.equals(twoFirstCP)){
                costeTotal=costeBase*1f;
            }
        }

        for (Integer ele : cpBarcelona){
            if (ele.equals(twoFirstCP)){
                costeTotal=costeBase*1.2f;
            }
        }

        return costeTotal;
    }

    @Override
    public Integer tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso>10){
            embalaje = IComun.PALE;
        }
        if (peso>1 && peso<10){
            embalaje = IComun.CARTON;
        }
        if ((peso>0 && peso<5) && x+y+z<200) {
            embalaje = IComun.CAJA;
        }
        return embalaje;
    }
}
