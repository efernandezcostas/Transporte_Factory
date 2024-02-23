public class Camion implements IComun{

    private Integer [] cpGalicia = {15, 27, 36, 32};
    private Integer [] cpMadrid = {18};
    private Integer [] cpBarcelona = {25,43,8,17};

    public Camion(){}

    @Override
    public float costeTotal(Integer cp) {

        float costeBase = (FactoryTransporte.embalaje+1)*10f;
        float costeTotal = costeBase;

        String pruebaFirst = cp.toString();
        String stringTwoFirst = "" + pruebaFirst.charAt(0) + pruebaFirst.charAt(1);
        Integer twoFirstCP = Integer.parseInt(stringTwoFirst);

        for (Integer ele : cpGalicia){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 1.5f;
        }
        for (Integer ele : cpMadrid){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 1f;
        }
        for (Integer ele : cpBarcelona){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 1.2f;
        }

        return costeTotal;
    }
}
