package person;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "090-9999-9999";
		jiro.address = "jiro@com";

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "080-8888-8888";
		hanako.address = "hanako@com";

		System.out.println(jiro.name+","+jiro.age+","+jiro.phoneNumber+","+jiro.address);
		System.out.println(hanako.name+","+hanako.age+","+hanako.phoneNumber+","+hanako.address);

		jiro.talk();
		hanako.walk();
		jiro.run();

		Robot aibo = new Robot();
		aibo.name = "アイボ";

		Robot asimo = new Robot();
		asimo.name = "アシモ";

		Robot pepper = new Robot();
		pepper.name = "ペッパー";

		Robot doraemon = new Robot();
		doraemon.name = "ドラえもん";

		System.out.println(aibo.name);
		System.out.println(asimo.name);
		System.out.println(pepper.name);
		System.out.println(doraemon.name);

	}

}
