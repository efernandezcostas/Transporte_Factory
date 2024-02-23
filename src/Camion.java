public class Camion implements IComun{

    @Override
    public float costeTotal(Integer cp) {

        float costeBase = (FactoryTransporte.embalaje+1)*10f;
        float costeTotal = costeBase;

        Integer twoFirstCP = Integer.parseInt("" + cp.toString().charAt(0) + cp.toString().charAt(1));

        for (Integer ele : cpGalicia){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 3.5f;
        }
        for (Integer ele : cpMadrid){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 2f;
        }
        for (Integer ele : cpBarcelona){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 3f;
        }

        return costeTotal;
    }
}
