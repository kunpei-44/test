package person02;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person02 taro = new Person02();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person02 jiro = new Person02("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person02 saburo = new Person02("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person02 nanasi = new Person02(25);
		System.out.println(nanasi.name);
		System.out.println(nanasi.age);

		Person02 hanako = new Person02(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}

}
