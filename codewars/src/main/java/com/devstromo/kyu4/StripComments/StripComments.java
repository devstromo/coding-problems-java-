package com.devstromo.kyu4.StripComments;

import java.util.Arrays;
import java.util.stream.Collectors;

class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        for (int i = 0; i < lines.length; i++) {
            for (String symbol : commentSymbols) {
                if (lines[i].contains(symbol)) {
                    lines[i] = lines[i].substring(0, lines[i].indexOf(symbol));
                }
                lines[i] = lines[i].stripTrailing();
            }
        }
        return  String.join("\n", lines);
    }

        public static String stripCommentsBest(String text, String[] commentSymbols) {
            String pattern = String.format(
              "[ ]*([%s].*)?$", String.join("", commentSymbols)
            );
            return Arrays.stream( text.split( "\n" ) )
              .map( x -> x.replaceAll( pattern, "" ) )
              .collect( Collectors.joining( "\n" ) );
        }
}
