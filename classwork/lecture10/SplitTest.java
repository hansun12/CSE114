public class SplitTest {

    public static void main (String[] args) {

        String s = "It,is:sunny,outside,and,it:looks:like,it,will,continue,for:a:while!";

        /* Note that split requires a pattern in the form of a regular
         * expression.  We have not studied what a regular expression is
         * and we will not until you get to another class if you take more CS
         * courses, but this example will show you enough to get by for now.
         * To see more on regular expressions and patterns, refer to
         * java.util.regex.Pattern
         *
         * The first regular expression in the code below ([,:]) says that
         * separators (delimiters) are either a comma (,) OR a colon (:).
         *
         * split is a method defined in the String class.  It splits a long
         * string into smaller strings called tokens (words delimited by the
         * delimiters) using the separators and put the tokens into an array
         * and returns that array.  In this example that array is assigned
         * to a variable named sarray.
         *
         * Once you get the tokens into an array, you can deal with the
         * words a little easier since you know what to do with an array
         * of strings.
         *
         * To see how split works, go ahead and run this program and see
         * what output is being generated by the program.
         */

        System.out.println("---------0----------------");

        // This regular expression says that separator (delimiter) is
        // either a comma (,) or a colon (:).
        String[] sarray = s.split("[,:]");  // [,:] is a regular expression.
        for (int i = 0; i < sarray.length; i++) {
            System.out.println(sarray[i]);
        }

        System.out.println("---------1----------------");

        // This regular expression says that separator (delimiter) is
        // either one or more of commas (,) or one or more of double
        // quotes ("). The plus sign ("+") in the regular expression means
        // 'one or more'.  \" is a way of including a " into another string
        // using the escape character \.  So, the regular expresion in this
        // case means one or more of either a comma or a double quote.
        sarray = s.split("[,\"]+");
        for (int i = 0; i < sarray.length; i++) {
            System.out.println(sarray[i]);
        }

        System.out.println("---------2---------------");

        // This time let's use blank spaces as separators.
        s = "It is raining outside    now!";

        // This regular expression says that separator (delimiter) is either
        // one or more blank spaces or nothing else.
        // added + because there are multiple consecutive blanks. In fact,
        // try it without the + sign, and see what you get in the resulting
        // array sarray.  See the size of the resulting array and see what
        // you have in it.  Well, a blank is hard to see when you print it
        // out, but you can verify an element is a blank or not, right?
        sarray = s.split("[ ]+"); 
        for (int i = 0; i < sarray.length; i++) {
            System.out.println(sarray[i]);
        }

        // Exercise: in each of the for loops above, we simply printed
        // the strings to the screen.  Modify at least one of the for
        // loops so that it counts the number of occurrences of a string
        // such as "it".
    }

}
