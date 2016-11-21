class Polindrom{
      public static void main(String[]args){
          String word = "BA";
          String revword = "";
          for(int i = word.length();i>0;i--){
              revword = revword + word.charAt(i-1);
	  }
          System.out.println(word.equals(revword));
	  System.out.println(revword);
      }
}
