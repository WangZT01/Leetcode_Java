package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle_118 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> generate = new ArrayList(new ArrayList<Integer>());
        for(int i = 1; i <= numRows; i++){
            List line = new ArrayList<Integer>();
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i - 1){
                    line.add(1);
                }
                else{
                    line.add(generate.get(i-2).get(j-1) + generate.get(i-2).get(j));
                }
            }
            generate.add(line);
        }
        return generate;
    }

}
