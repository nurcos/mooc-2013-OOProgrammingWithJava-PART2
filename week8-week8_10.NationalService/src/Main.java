public class Main {
    public static void main(String[] args) {
        CivilService cs = new CivilService();
        MilitaryService ms = new MilitaryService(2);
        
        System.out.println(cs.getDaysLeft());
        cs.work();
        System.out.println(cs.getDaysLeft());
        
        System.out.println(ms.getDaysLeft());
        ms.work();
        ms.work();
        ms.work();
        System.out.println(ms.getDaysLeft());
    }
}
