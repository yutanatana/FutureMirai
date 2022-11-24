package main;

public class Question6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		        User user1 = new Employee(2346, "19910505", "fkaj", "201604");
		        User user2 = new Employee(2346, "19910505", "fkaj", "201604");
		        String result = "";

		        if (user1.equals(user2)) {result += "0 ";};
		        if (user1 == user2) {result += "1 ";};

		        Employee employee1 = new Employee(9999, "19910505", "fkaj", "202104");
		        user1 = employee1;
		        if (user1.equals(user2)) {result += "2 ";};
		        if (user1 == user2) {result += "3 ";};

		        Employee employee2 = new Employee(2346, "19910207", "HOGEFUGA", "202104");
		        user1 = employee2;
		        if (user1.equals(user2)) {result += "4 ";};
		        Employee user3 = employee2;
		        if (user1 == user3) {result += "5 ";};
		        System.out.print(result);

		    }
	}


