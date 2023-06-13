package Solution;

public class Task2 {
    

    String[] plans = {"Меркурий", "Венера", "Земля", "Марс", 
    "Сатурн", "Юпитер", "Уран", "Нептун", "Плутон"};

    ArrayList<String> planets = new ArrayList<>();

    SecondTask() {
        planets = randomFill(plans, planets);
    }    
    

    public ArrayList<String> randomFill(String[] plans, ArrayList<String> planets) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; ++i) {
            planets.add(plans[(int) (Math.random()* plans.length)]);
        }
        System.out.println(planets);
        return planets;
        
    }

    public HashMap<String, Integer> namesCounts() {
        HashMap<String, Integer> dict = new HashMap<>();
        for (String string : planets) {
            if (dict.keySet().contains(string)) {
                dict.put(string, dict.get(string) + 1);
            } else {
                dict.put(string, 1);
            }
        }
        return dict;
        
    }
}
