public class ImplementDA {
    public static void main(String[] args) {
        DynamicArray da  = new DynamicArray();

        System.out.println(da.capacity);
        da.add("A");
        da.add("B");
        da.add("C");
        
        da.add("D");
        da.add("E");
        
        da.delete("D");
        da.delete("A");
        da.delete("B");



        da.insert(0, "S");
        
        System.out.println(da);
        System.out.println("empty: "+da.isEmpty());
        System.out.println("size: "+da.size);
        System.out.println("capacity: "+da.capacity);
        System.out.println("searchindex: "+da.search("E"));


    }
}
