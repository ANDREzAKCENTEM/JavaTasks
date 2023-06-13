package Solution;

public static void filler(){
    ArrayList<Integer> array = new ArrayList<>();
    Random rnd = new Random();
    for (int i = 0; i < 10; ++i){
        array.add(rnd.nextInt(100));
    }
    System.out.println(array);

    array.sort(Integer:: compareTo);

    return array;
}
