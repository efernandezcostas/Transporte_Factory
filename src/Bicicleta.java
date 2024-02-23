public class Bicicleta implements IComun{

    private Float costeTotal;
    private Float costeBase ;
    private Integer embalaje;

    private Integer [] cpGalicia = {15, 27, 36, 32};
    private Integer [] cpMadrid = {18};
    private Integer [] cpBarcelona = {25,43,8,17};

    @Override
    public float costeTotal(Integer cp) {
        Float costeBase = embalaje*10f;
        Float costeTotal = costeBase;

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
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if (peso>10){
            embalaje = 0;
        }
        if (peso>1 && peso<10){
            embalaje = 2;
        }
        if ((peso>0 && peso<5) && x+y+z<200) {
            embalaje = 1;
        }
        return embalaje;
    }
}
