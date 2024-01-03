package kr.or.ddit.HomeWork;

import java.util.*;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 obj = new HomeWork18();
		
		obj.process();
		
	}
	
	public void process() {
		List<Map> list = dataInput();
		int maxSal = getMaxSalary(list);

		
		System.out.println("가장 많은 급여 -> "+ maxSal);
		
		HashMap map = getDeptSalary(list);
		
		System.out.println("기획부 : " + map.get("기획부"));
		System.out.println("영업부 : "+ map.get("영업부"));
		System.out.println("총무부 : "+ map.get("총무부"));
		
		
		printEmp101(list);
	}
	
	public List<Map> dataInput(){
		// emp_no	emp_name	dept	salary
		// 100		김기훈		영업부	300
		// 101		홍성범		기획부	350
		// 102		이민수		기획부	500
		// 103		강나미		영업부	350
		// 109		민병철		총무부	250
		
		HashMap map1 = new HashMap();
		map1.put("emp_no", "100");
		map1.put("emp_name", "김기훈");
		map1.put("dept", "영업부");
		map1.put("salary", 300);
		
		HashMap map2 = new HashMap();
		map2.put("emp_no", "101");
		map2.put("emp_name", "홍성범");
		map2.put("dept", "기획부");
		map2.put("salary", 350);
		
		HashMap map3 = new HashMap();
		map3.put("emp_no", "102");
		map3.put("emp_name", "이민수");
		map3.put("dept", "기획부");
		map3.put("salary", 500);
		HashMap map4 = new HashMap();
		
		map4.put("emp_no", "103");
		map4.put("emp_name", "강나미");
		map4.put("dept", "영업부");
		map4.put("salary", 350);
		HashMap map5 = new HashMap();
		
		map5.put("emp_no", "109");
		map5.put("emp_name", "민병철");
		map5.put("dept", "총무부");
		map5.put("salary", 250);
		
		ArrayList emp = new ArrayList();
		emp.add(map1);
		emp.add(map2);
		emp.add(map3);
		emp.add(map4);
		emp.add(map5);
		
		return emp;
	}
	
	
	public int getMaxSalary(List<Map> l) {
		
		int max = 0;
		
		for(int i=0; i< l.size(); i++) {
			HashMap map = (HashMap)l.get(i);
			int sal = (int)map.get("salary");	
			
			max = Math.max(max, sal);
		} 
		
		return max;
		
	}
	
	public HashMap getDeptSalary(List<Map> l){
			
		
		HashMap result = new HashMap();
		
		for(int i = 0; i< l.size(); i++) {
			HashMap m = (HashMap) l.get(i);
			
			String dept = (String)m.get("dept");	
			int sal = (int)m.get("salary");
	
			
			int sum = 0;
			if(result.containsKey(dept)) {			
				sum = (int) result.get(dept);
			}

			sum += sal;
			
			result.put(dept, sum);
		}
			
		
		return result;
		
	}
	
	public void printEmp101(List<Map> l) {
		
			System.out.println("=============== 명예의 전당 ===============");
			for (int i = 0; i < l.size(); i++) {
				HashMap map = (HashMap) l.get(i);
				if(!map.get("emp_no").equals("101")) continue; 
				
				System.out.println("emp_no : " + map.get("emp_no"));
				System.out.println("emp_name : " + map.get("emp_name"));
				System.out.println("dept : " + map.get("dept"));
				System.out.println("salary : " + map.get("salary"));
				
			}	
			System.out.println("======================================");
		}
				
}
