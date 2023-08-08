package day6_ex;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	private String phoneNum;
	private String email;

	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getInfo() {
		return super.getInfo() + "  " + phoneNum + "  " + email;
	}

}

public class FriendTest {

	public static void main(String[] args) {

		Friend friend1 = new Friend("철수", "010-1234-1234", "cs@cs.com");
		Friend friend2 = new Friend("영희", "010-2345-2345", "yh@yh.com");
		Friend friend3 = new Friend("나희", "010-3456-3456", "nh@nh.com");
		Friend friend4 = new Friend("덕규", "010-4567-4567", "dk@dk.com");
		Friend friend5 = new Friend("경민", "010-5678-5678", "km@km.com");

		Friend[] ary = { friend1, friend2, friend3, friend4, friend5 };

		System.out.println("이름  전화번호	    메일주소");
		System.out.println("-----------------------------");
		for (Friend obj : ary)
			System.out.println(obj.getInfo());

	}

}
