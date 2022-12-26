import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        int total = 0;

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                stack.pop();
            } else if(operations[i].equals("D")){
                int prevScore = stack.pop();
                int newScore = prevScore * 2;
                stack.push(prevScore);
                stack.push(newScore);
            } else if(operations[i].equals("+")){
                System.out.println("yo");
                int prevScore = stack.pop();
                int prevScore2 = stack.pop();
                int sum = prevScore + prevScore2;
                System.out.println(prevScore);
                System.out.println(prevScore2);
                stack.push(prevScore2);
                stack.push(prevScore);
                stack.push(sum);
            } else {
                int points = Integer.parseInt(operations[i]);
                stack.push(points);
            }

        }

        while(stack.size() > 0) total += stack.pop();
        return total;
    }
    public static void main(String[] args){
        String[] operations = {"5","2","C","D","+"};
        calPoints(operations);
    }
}
