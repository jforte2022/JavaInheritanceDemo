public class NavySailor extends Person{
    private String dutyStatus;
    private String shipType;
    private String rank;
    
    public NavySailor(String f, String m, String l, String g, String d, String s, String r){
        super(f, m, l, g);
        dutyStatus = d;
        shipType = s;
        rank = r;
    }
    
    public String toString(){
        return String.format("%s %s %s %s", super.toString(), dutyStatus, shipType, rank);
    }
}