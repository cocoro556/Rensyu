import java.util.ArrayList;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = new ArrayList<String>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("7");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (String s : list) {
			System.out.println(s);
		}

	}

}