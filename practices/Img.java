import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Img
{
	public static void main(String[] args) {
String htmlFragment = "<img src='http://img01.ibnlive.in/ibnlive/uploads/2015/11/Videocon-Delite.gif' width='90' height='62'>Videocon Mobile Phones has launched three new Android smartphones - Z55 Delite, Z45 Dazzle, and Z45 Amaze with prices starting at Rs 4,599.";

    Pattern pattern =
            Pattern.compile( ".*(<img\\s+.*src\\s*=\\s*'([^']+)'.*>).*" );
    Matcher matcher = pattern.matcher( htmlFragment );
    if( matcher.matches()) {
        String match =  matcher.group(1);
        String match1 =  matcher.group(2);

        //match.replaceAll("'","");
        System.out.println(match);
        System.out.println(match1);
        //System.out.println(match2);

        String newString = htmlFragment.replaceAll(match,"");
        System.out.println(newString);

    }


}
}
