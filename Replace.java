class Replace
{
  public static void main(String[] ar)
  {
    String s="abcdefg";
    //s=s.replace(['a','e','i','o','u'],'$');
    s=s.replaceAll("[aeiou]","\\$");
    System.out.println(s);
  }
}