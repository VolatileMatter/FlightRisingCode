//importions
import java.util.*; 
import java.io.*;
import java.nio.*;


class nameMaker
{
  public static Scanner s1; 
  
  public String[] prefix = {"anti","auto","de","dis","down","extra","hyper","il","im","in","ir","inter","mega","mid","mis","non","over","out","post","pre","pro","re","semi","sub","sub","super","tele","trans","ultra","un","under","up"};
  public String[] firCon = {"t", "n", "s", "r", "d", "f", "c", "b", "z"};
  public String[] secCon = {"r", "h", "s","v"};
  public String[] firVow = {"e", "a", "i", "o", "oo", "u"};
  public String[] thiCon = {"t", "v", "w", "x", "ck", "g", "p", "ch", "sh","ph","rr",};
  public String[] secVow = {"e", "i", "o","a","u"}; 
  public String[] fouCon = {"r", "s", "y","de","x","ra","le",};
  public String[] suffix = {"iode","able","ac","acity","ocity","ade","age","aholic","oholic","al","algia","an","ian","ance","ant","ar","ard","arian","arium","orium","ary","ation","ate","ative","cide","cracy","crat","cule","cy","cycle","dom","dox","ed","ee","ectomy","eer","emia","en","ence","ency","ent","er","ern","escence","ese","esque","ess","est","etic","ette","ful","fy","gam","gamy","gon","gonic","hood","ial","ian","iasis","iatric","ible","ic","ical","ile","ily","ine","ing","ion","ious","ish","ism","ist","ite","itis","ity","ive","ization","ize","less","let","like","ling","loger","logist","log","ly","ment","ness","oid","ology","oma","onym","opia","opsy","or","ory","osis","ostomy","otomy","ous","path","pathy","phile","phobia","phone","phyte","plegia","plegic","pnea","scopy","scope","scribe","script","sect","ship","sion","some","sophy","sophic","th","tion","tome","tomy","tude","trophy","tude","ty","ular","uous","ure","ward","ware","wise"};
  public int numnum = (int)(Math.random() * 100000); 
  public     ArrayList<String> results = new ArrayList<String>();
  public      ArrayList<String> origfile = new ArrayList<String>();
  
  
  public static void main(String[] args) throws IOException
  { 

    Rextester wrdmkr = new Rextester(); 
    System.out.println(wrdmkr.makeWords(20));
  }
  
  
  public ArrayList<String> makeWords(int numWords)  throws IOException {
    String result = " "; 


    
    for(int i = 0; i<numWords; i++) {
        
        //start with the prefix
        if(Math.random() < .5) {
            result += prefix[(int)(Math.random() * prefix.length)];
        }
        
        //then the first consonant
        if(Math.random() < .7) {
            result += firCon[(int)(Math.random() * firCon.length)];
        }
        
        //then the possible second consonant
        if(Math.random() < .4) {
            result += secCon[(int)(Math.random() * secCon.length)];
        }
        
        //then the first vowel
        if(Math.random() < .9) {
            result += firVow[(int)(Math.random() * firVow.length)];
        }
        
        //then the third consonant
        if(Math.random() < .8) {
            result += thiCon[(int)(Math.random() * thiCon.length)];
        }
        
        //then the second vowel
        if(Math.random() < .6) {
            result += secVow[(int)(Math.random() * secVow.length)];
        }
        
        //then the fourth consonant
        if(Math.random() < .5) {
            result += fouCon[(int)(Math.random() * fouCon.length)];
        }
        
        //possibly another vowel?
        if(Math.random() < .5) {
            result += secVow[(int)(Math.random() * secVow.length)];
        }
        
        //then the suffix
        if (Math.random() < .5) {
            result += suffix[(int)(Math.random() * suffix.length)];
        }
        
        //if it's short, then maybe repeat it. (Seg -> Segseg)
        if (Math.random() < .7 && (result.length() < 6)) {
        result += result.substring(1,result.length());
        }
        
        //lastly, capitalize the first letter.
        String temp1 = result.substring(1,2);
        String temp2 = result.substring(2,result.length());
        temp1 = temp1.toUpperCase();
        result = temp1 + temp2;
        
        //if it's too long, delete it. 
        if (result.length() < 9) {
                  
      results.add(i, result); 

        }
        else {i--;}
        
        result = " ";

    }

     
    return results; 
  }
}