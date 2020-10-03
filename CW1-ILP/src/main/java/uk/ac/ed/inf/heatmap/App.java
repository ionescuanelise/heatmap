package uk.ac.ed.inf.heatmap;

import java.io.*;
import java.util.*;

public class App
{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> predictions = new ArrayList<ArrayList<Integer>>();
        int noLine = 0;

        try {
            Scanner reader = new Scanner(new File(args[0]));

            while (reader.hasNextLine()) {
                // use comma and any number of spaces as separators
                String[] rowMap = reader.nextLine().split("\\s*,\\s*");
                predictions.add(new ArrayList<Integer>());

                for(String value : rowMap) {
                    predictions.get(noLine).add(Integer.parseInt(value));
                }
                noLine++;

            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < predictions.size(); i++){
            for(int j = 0; j < predictions.get(0).size(); j++)
                System.out.print(predictions.get(i).get(j) + " ");
            System.out.println();
        }

    }

}
