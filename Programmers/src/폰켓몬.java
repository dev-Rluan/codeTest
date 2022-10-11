import java.util.HashSet;
public class 폰켓몬 {
    
    public int solution(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (Integer n : nums) {
            numbers.add(n);

        }
        System.out.println(numbers);
        return numbers.size()*numbers.size()-1;
    }

    public static void main(String[] args) {
        폰켓몬 sol = new 폰켓몬();
        int[] nums = {3, 1, 2, 3};
        System.out.println(sol.solution(nums));

    }
    
}
