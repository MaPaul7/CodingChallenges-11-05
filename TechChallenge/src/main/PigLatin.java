package main;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pigLatin("Cats are great pets.");
		pigLatin("Tom got a small piece of pie.");
		pigLatin("He told us a very exciting tale.");
		pigLatin("Hello, have you made a decision?");
		
	}
	public static void pigLatin(String s) {
		String vowels = "AEIOUaeiou";
		String[] arr = s.split(" ");
		String ret = "";
		for(int i = 0; i < arr.length; i++) {
			if(vowels.contains(Character.toString(arr[i].charAt(0)))) {
				arr[i] = arr[i] + "way";
			}
			else {
				arr[i] = arr[i].substring(1) + arr[i].substring(0,1) + "ay";
			}
			if(arr[i].contains(".") || arr[i].contains(",") || arr[i].contains("!") || arr[i].contains("?")) {
				arr[i] = arr[i].substring(0, arr[i].length()-4) + arr[i].substring(arr[i].length()-3) 
						+ arr[i].substring(arr[i].length()-4, arr[i].length()-3);
			}
				
		}
		for(int i = 0; i < arr.length; i++) {
			ret += arr[i] + " ";
		}
		System.out.println(ret);
	}

}
