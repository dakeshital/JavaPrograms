package stringprograms;

public class RemoveSpacesAndSpecialChar {

	public static void main(String[] args) {
		String str = "s h i t a l";
		System.out.println(str.replaceAll(" ", ""));
		
		String str2="hello%$*@#my&nameis @shital";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));   //^ -->used for otherthan that

	}

}
