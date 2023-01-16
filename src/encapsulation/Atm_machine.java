package encapsulation;

public class Atm_machine {
	
public static void main(String[] args) {
	Bank_Server s = new Bank_Server();
	s.getbalance(1234);
	s.getbalance(1553);
	s.setbalance(21000);
	s.getbalance(1234);
	s.getbalance(22233);
	
	
}
}
