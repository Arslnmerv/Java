package practices.generic;

public class G07GenericInterface {
    public static void main(String[] args) {
        usAlClass<Float> floatUs = new usAlClass<>();
        System.out.println(floatUs.usAl(5f, 2f));

        usAlClass<Integer> ıntUs = new usAlClass<>();
        System.out.println(ıntUs.usAl(4, 3));


        usAlClass<Double> dbUs = new usAlClass<>();
        System.out.println(dbUs.usAl(2.1, 4.1));
    }

}

//Generic Interface
interface MathIslem<T extends Number> {
    double usAl(T t, T u);//abs meth
}

//Generic Class Generic Interface'den usAl()  method implement edildi
class usAlClass<T extends Number> implements MathIslem<T> {

    public double usAl(T t, T u) {
        return Math.pow(t.doubleValue(), u.doubleValue());
    }
}
