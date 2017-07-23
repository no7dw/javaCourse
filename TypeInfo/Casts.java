class Building {}

class House extends Building {}

public class Casts {
    public static void main(String[] args) {
        Building b = new House();
        House h = (House) b;
        try{
            Class<House> hClass = House.class;
            House house = hClass.newInstance();
            Class<? super House> up = hClass.getSuperclass();
            Object obj = up.newInstance();
            
            System.out.println(house);    
            System.out.println(obj);    
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
