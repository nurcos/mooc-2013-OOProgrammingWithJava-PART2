package reader;

import reader.criteria.AllLines;
import reader.criteria.AtLeastOne;
import reader.criteria.Both;
import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.LengthAtLeast;
import reader.criteria.Not;

public class Main {

    //http://www.gutenberg.org/files/2554/2554-0.txt
    
    public static void main(String[] args) {
    String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
    GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new AtLeastOne(
            new ContainsWord("offered"),
            new ContainsWord("asked"),
            new ContainsWord("and")
        );

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }
}
