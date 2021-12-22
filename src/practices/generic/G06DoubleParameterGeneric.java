package practices.generic;

public class G06DoubleParameterGeneric {
    public static void main(String[] args) {
        EbikGabik<Integer, String> obj1 = new EbikGabik<>(101, "ipek");
        //EbikGabik<Integer,Integer> obj2=new EbikGabik<>(571,622);// CTE
        // EbikGabik<String ,String > obj3=new EbikGabik<>("102","haluk"); //CTE
        System.out.println(obj1.getKey() + " " + obj1.getValue()); //101 ipek
    }
}

// 2 parametreli Generic Class
class EbikGabik<K extends Number, V extends String> {
    // class EbikGabik <K ,V >{-->Generic Class'ta parametre istenirse sınırlandırılabilir
    //Sınırlandırma için istenen Data type Class'ından extends edilir. Bu isleme PARAMETER BOUNDING denir
    private K key;
    private V value;

    public EbikGabik(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
