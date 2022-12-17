package chap13;

import java.util.ArrayList;
import java.util.List;

public class ArticleEx {
	static List<Article> list;
	public static void main(String[] args) {
		
		list = selectAll();
		for (Article art : list) {
		System.out.println(art);
		}
		
//		System.out.println(select(2));
	}
	
	
//	public static void main(String[] args) {
//		List<Article> list = new ArrayList<Article>();
//		
//		list.add(new Article(1, "홍길동", "1", "3", 0));
//		list.add(new Article(2, "홍길동2", "11", "4", 0));
//		list.add(new Article(3, "홍길동3", "22", "5", 0));
//		list.add(new Article(4, "홍길동4", "33", "6", 0));
//		
//		for (Article art : list) {
//			System.out.println(art);
//		}
//	}
	public static List<Article> selectAll() {
		List<Article> list = new ArrayList<Article>();
		
		list.add(new Article(1, "홍길동", "1", "3", 0));
		list.add(new Article(2, "홍길동2", "11", "4", 0));
		list.add(new Article(3, "홍길동3", "22", "5", 0));
		list.add(new Article(4, "홍길동4", "33", "6", 0));
//		for (Article art : list) {
//			System.out.println(art);
//			}
		return list;
	}
	
	
	public static Article select(int i) {
//		Article art = list.get(0);
//		return art;
		return list.get(i);
	}

}
