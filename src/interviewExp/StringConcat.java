package interviewExp;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "SAMIR";
		// SKAUMMIARR
		String str2 = "KUMAR";

		int len = Math.max(str1.length(), str2.length());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {

			if (i < str1.length()) {
				sb.append(str1.charAt(i));
			}

			if (i < str2.length()) {
				sb.append(str2.charAt(i));
			}
		}

		System.out.println(sb.toString());
	}

}
