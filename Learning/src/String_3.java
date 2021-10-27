public class String_3 {


//    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
//
//    countYZ("fez day") → 2
//    countYZ("day fez") → 2
//    countYZ("day fyyyz") → 2

    public int countYZ(String str) {
        int countYZ=0;
        String string=str.toLowerCase();
        for (int i=0;i<str.length()-1; i++){
            if (i<str.length()-1 && (string.charAt(i)=='z' || string.charAt(i)=='y') && Character.isLetter(string.charAt(i+1))==false){
                countYZ++;
            }
            else if (string.charAt(string.length()-1)=='z' || string.charAt(string.length()-1)=='y'){
                countYZ++;
            }
        }
        return countYZ;
    }



//    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
//
//    gHappy("xxggxx") → true
//    gHappy("xxgxx") → false
//    gHappy("xxggyygxx") → false

    public boolean gHappy(String str) {
        boolean answer=true;
        if (str.length()==1 && str.charAt(0)=='g'){
            answer=false;
        }
        for (int i=0; i<str.length(); i++){
            if (i<str.length()-1 && str.charAt(i)=='g' &&  str.charAt(i+1)=='g'){
                answer=true;
                i++;
            }
            else if (str.length()>0 && str.charAt(i)=='g' && str.charAt(i-1)=='g'){
                answer=true;
            }
            else{
                answer=false;
            }
        }
        return answer;
    }



}
