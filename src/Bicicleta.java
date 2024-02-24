public class Bicicleta implements IComun{

    @Override
    public float costeTotal(Integer cp, Integer embalaje) {

        float costeBase = (embalaje+1)*10f;
        float costeTotal = costeBase;

        Integer twoFirstCP = Integer.parseInt("" + cp.toString().charAt(0) + cp.toString().charAt(1));

        for (Integer ele : cpGalicia){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 1.3f;
        }
        for (Integer ele : cpMadrid){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 1.1f;
        }
        for (Integer ele : cpBarcelona){
            if (ele.equals(twoFirstCP)) costeTotal = costeBase * 1.2f;
        }

        return costeTotal;
    }
}
