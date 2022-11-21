public class TaskTwo {
    public static void main(String[] args) {
        MyCollection<Object> customList = new MyCollection<>();

        customList.add(12);
        customList.add(5);
        customList.add("Текст");
        customList.add(23);
        customList.add(10);
        customList.add(54);
        customList.add("Какой-то текст");
        customList.add(34);

        printCollection(customList);
        System.out.println("Под номером 3 (считая от 0) находится: " + customList.get(3));
        System.out.println("Под номером 6 (считая от 0) находится: " + customList.get(6));

    }
    public static void printCollection(MyCollection<Object> list){
        int ind = 0;
        for (Object i: list) {
            System.out.println(ind + ": " + i);
            ind++;
        }
    }
}
