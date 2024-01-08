package test;

public class Test {
	
	public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(s, overwrite_string.length()) + overwrite_string;
        
        System.out.println(my_string.substring(s, overwrite_string.length() + 1));
        
        
        
        return answer;
        
        
    }

	public static void main(String[] args) {
		
		
		Test test = new Test();
		String a = test.solution("He11oWor1d", "lloWorl", 2);
		
		System.out.println(a);
		
	}

}
