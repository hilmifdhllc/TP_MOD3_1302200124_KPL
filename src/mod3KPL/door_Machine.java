package mod3KPL;
public class door_Machine {
    private String state = "Terkunci";
    public void pintu(String command) {
        switch (command) {
            case "buka pintu":
                this.state = "Terbuka";
                break;
            case "kunci pintu":
                this.state = "Terkunci";
                break;
        }
    }
    public String getState(){
        return this.state;
        
    }
}
