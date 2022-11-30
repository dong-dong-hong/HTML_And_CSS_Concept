// package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stack;

public class Test{

public static int sol(String answer) {
    stack<character> stack = new  stack<character>();
    int barCount;

    for(int i=0; i <= answer.length; i++) {

        if(answer.charAt(i) == '(') {
            stack.push('(');
        }else if(answer.charAt(i) == '\'){
            barCount += stack.size();
        }else{
            barCount += 1;
            stack.pop();
        }
    }
    return barCount;
}
}