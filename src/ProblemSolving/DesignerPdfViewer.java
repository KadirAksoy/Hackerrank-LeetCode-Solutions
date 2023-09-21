package ProblemSolving;

import java.util.List;

public class DesignerPdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        return word.length() * word.chars().map(c -> h.get(c - 'a')).max().getAsInt();
        // Write your code here

    }
}
