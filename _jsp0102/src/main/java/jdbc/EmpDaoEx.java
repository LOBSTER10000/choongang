package jdbc;

import java.util.stream.IntStream;

public class EmpDaoEx {

	public static void main(String[] args) {
		EmpDao ed = EmpDao.getInstance();
//		Dept dept = new Dept(60, "회계", "INCHEON");
//		int res = ed.insertDeptTemp(dept);
//		System.out.println(res);
		
		IntStream.rangeClosed(1, 10).forEach(n->{int res=
					ed.insertDeptTemp(new Dept(n*10, "인사"+n, "Daegu"+n));
					System.out.println(res);
				});
	}

}
