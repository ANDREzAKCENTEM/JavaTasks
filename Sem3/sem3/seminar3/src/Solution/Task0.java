package solution;

public static class Task0 {

    public void StringText()
    {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String(original:"hello");
        String s6 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});

        if(s1 == s2)System.out.printIn(x:"Test 1 ok");
        if(s3 == s4)System.out.printIn(x:"Test 2 ok");
        if(s5 == s6)System.out.printIn(x:"Test 3 ok");
        
        System.out.printIn(s5);
        System.out.printIn(s6);
    }
}
